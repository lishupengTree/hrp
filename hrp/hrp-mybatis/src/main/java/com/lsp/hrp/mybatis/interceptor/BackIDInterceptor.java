package com.lsp.hrp.mybatis.interceptor;


import com.lsp.hrp.mybatis.annotation.Sequence;
import com.lsp.hrp.mybatis.commons.Entity;
import com.lsp.hrp.mybatis.commons.EntityDao;
import com.lsp.hrp.mybatis.commons.IdCol;
import com.lsp.hrp.mybatis.dialect.Dialect;
import com.lsp.hrp.mybatis.dialect.MySQLDialect;
import com.lsp.hrp.mybatis.dialect.OracleDialect;
import com.lsp.hrp.mybatis.util.ClassUtils;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * 回填id拦截器
 * @date 2015年8月25日 下午5:51:11 
 * @author wangk
 * @Description:
 * @project honlly-mybatis
 */
public class BackIDInterceptor implements AfterReturningAdvice,MethodBeforeAdvice{
	private static final Logger LOGGER = Logger.getLogger(BackIDInterceptor.class); 
	private ThreadLocal<Class<? extends Entity>> localClazz = new ThreadLocal<>();
	
	@Override
	public void afterReturning(Object result, Method method, Object[] parameter, Object target) throws Throwable {
		if(!EntityDao.class.isInstance(target)){
			LOGGER.error("被切入对象不是EntityDao的子类或它本身，请检查！！！");
			return;
		}
		try {
			EntityDao<?> dao = (EntityDao<?>) target;
			String dialectName = ClassUtils.getActualTypeArguments(EntityDao.class, localClazz.get())[0].isAnnotationPresent(Sequence.class)? "oracle":"mysql";
			Dialect dialect = new MySQLDialect();
			if("oracle".equalsIgnoreCase(dialectName)){
				dialect = new OracleDialect();
			}else if("mysql".equalsIgnoreCase(dialectName)){
				
			}else{
				throw new RuntimeException("数据库:"+dialect+"，暂不支持！！！");
			}
			if(method.isAnnotationPresent(InsertProvider.class)){
				Long cur = getCurrentSeq(dao,dialect);
				if(parameter.length>1){
					@SuppressWarnings("unchecked")
					List<Entity> entities = (List<Entity>) parameter[0];
					Long[] ids = (Long[]) parameter[1];
					if(ids.length>0){
						for (int i = 0; i < ids.length; i++) {
							entities.get(i).setId(ids[i]);
						}
					}else{
						dialect.setMultiEntitiesIds(entities, cur);
					}
				}else{
					if(parameter[0] instanceof Entity){
						Entity entity = (Entity) parameter[0];
						entity.setId(cur);
					}else if(parameter[0] instanceof Map){
						@SuppressWarnings("unchecked")
						Map<String, Object> map = (Map<String, Object>) parameter[0];
						map.put(IdCol.id, cur);
					}
				}
			}
		} catch (Exception e) {
			throw e;
		} finally {
			localClazz.remove();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void before(Method method, Object[] parameter, Object target) throws Throwable {
		localClazz.set((Class<? extends Entity>) target.getClass());
	}
	
	@SuppressWarnings("unchecked")
	private Long getCurrentSeq(EntityDao<?> dao, Dialect dialect){
		List<Map<String, Object>> result = dao.execute(dialect.getCurrentSeqSql((Class<? extends Entity>)ClassUtils.getActualTypeArguments(EntityDao.class, localClazz.get())[0]));
		Object currSeq = result.get(0).get("MAXID");
		return dialect.convertSeq(currSeq);
	}

}

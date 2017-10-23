package com.lsp.his.web.security;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lishupeng
 * @create 2017-10-24 上午 12:12
 **/
@Component("myShiro")
public class MyShiro extends AuthorizingRealm {

//    @Resource
//    private UserService userService;

    @Resource
    private SessionDAO sessionDAO;

//    @Resource
//    private UserPermService userPermService;

    /**
     * 为当前登录的Subject授予角色和权限
     * @see:  经测试:本例中该方法的调用时机为需授权资源被访问时
     * @see:  经测试:并且每次访问需授权资源时都会执行该方法中的逻辑,这表明本例中默认并未启用AuthorizationCache
     * @see:  个人感觉若使用了Spring3.1开始提供的ConcurrentMapCache支持,则可灵活决定是否启用AuthorizationCache
     * @see:  比如说这里从数据库获取权限信息时,先去访问Spring3.1提供的缓存,而不使用Shior提供的AuthorizationCache
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取登录时输入的用户名
        String loginName = (String) principalCollection.fromRealm(getName()).iterator().next();
        //到数据库查是否有此对象
//        UserUserDto userUserDto = new UserUserDto();
//        userUserDto.setUserAccount(loginName);
//        UserUser user = userService.selectWithRole(userUserDto);
//        if(user != null){
//            //权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
//            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//
//            //用户的角色集合
//            info.setRoles(getRoles(user.getRoleCode()));
//            //用户的角色对应的所有权限，如果只使用角色定义访问权限，下面的四行可以不要
//            List<UserPerm> perms = userPermService.listPerm(user.getRoleId());
//            info.addStringPermissions(getPerms(perms));
//            return info;
//        }
        return null;
    }

    /**
     * 登录认证;
     */
    /**
     * 验证当前登录的Subject
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token=(UsernamePasswordToken) authenticationToken;

        //查出是否有此用户
//        UserUserDto userUserDto = new UserUserDto();
//        userUserDto.setUserAccount(token.getUsername());
//        userUserDto.setStatus(1);
//        UserUser user = userService.selectWithRole(userUserDto);
//        if(user!=null){
//            Collection<Session> sessions = sessionDAO.getActiveSessions();
//            Serializable sessionId = SecurityUtils.getSubject().getSession().getId();
//            for (Session session:sessions) {
//                if(token.getUsername().equals(String.valueOf(session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY)))
//                        &&!session.getId().equals(sessionId)) {
//                    session.setTimeout(0);
//                    break;
//                }
//            }
//            ShiroSecurityHelper.setUser(user);
//
//            ByteSource credentialsSalt = ByteSource.Util.bytes(user.getUserAccount());//这里的参数要给个唯一的;
//            //若存在，将此用户存放到登录认证info中
//            return new SimpleAuthenticationInfo(user.getUserAccount(), user.getUserPwd(), credentialsSalt, getName());
//        }
        return null;
    }

    private Set<String> getRoles(String roleCode){
        Set<String> set=new HashSet<>();
        set.add(roleCode);
        return set;
    }

//    private List<String> getPerms(List<UserPerm> perms){
//        List<String> list=new ArrayList<>();
//        for (UserPerm userPerm : perms) {
//            list.add(userPerm.getPermCode());
//        }
//        return list;
//    }
//
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    public void setSessionDAO(SessionDAO sessionDAO) {
        this.sessionDAO = sessionDAO;
    }

//    public void setUserPermService(UserPermService userPermService) {
//        this.userPermService = userPermService;
//    }
}

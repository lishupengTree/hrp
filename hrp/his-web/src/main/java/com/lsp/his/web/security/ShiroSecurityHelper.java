package com.lsp.his.web.security;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lishupeng
 * @create 2017-10-24 上午 12:12
 **/
public class ShiroSecurityHelper {
    private static Map<String,Object> currentUserMap = new ConcurrentHashMap();

    private static String hashAlgorithmName = "MD5";
    private static int hashIterations = 1024;

    /**
     * 把user放到cache中
     *
     * @param user
     */
//    public static void setUser(UserUser user) {
//        currentUserMap.put(user.getUserAccount(),user);
//    }

    /**
     * 清除当前用户的缓存
     */
    public static void clearCurrentUserCache() {
        if (hasAuthenticated()) {
            currentUserMap.remove(getCurrentUserAccount());
        }
    }

    /**
     * 从cache拿当前user
     *
     * @return
     */
//    public static UserUser getCurrentUser() {
//        if (!hasAuthenticated()) {
//            return null;
//        }
//        return currentUserMap.get(getCurrentUserAccount());
//    }

    /**
     * 获得当前用户名
     *
     * @return
     */
    public static String getCurrentUserAccount() {
        Subject subject = getSubject();
        PrincipalCollection collection = subject.getPrincipals();
        if (null != collection && !collection.isEmpty()) {
            return (String) collection.iterator().next();
        }
        return null;
    }

    /**
     *
     * @return
     */
    public static Session getSession() {
        return SecurityUtils.getSubject().getSession();
    }


    /**
     * 判断当前用户是否已通过认证
     * @return
     */
    public static boolean hasAuthenticated() {
        return getSubject().isAuthenticated();
    }

    private static Subject getSubject() {
        return SecurityUtils.getSubject();
    }

    public static Map getAllUser(){
        return currentUserMap;
    }

    /**
     * 验证用户是否具备某角色。
     *
     * @param role
     *        角色名称
     * @return 用户是否具备某角色
     */
    public static boolean hasRole(String role) {
        Subject subject = SecurityUtils.getSubject();
        return subject != null && subject.hasRole(role) == true;
    }

    /**
     * 加密
     * @param account
     * @param pwd
     * @return
     */
    public static String encodePwd(String account, String pwd){
        ByteSource credentialsSalt = ByteSource.Util.bytes(account);
        Object obj = new SimpleHash(hashAlgorithmName, pwd, credentialsSalt, hashIterations);
        return String.valueOf(obj);
    }
}

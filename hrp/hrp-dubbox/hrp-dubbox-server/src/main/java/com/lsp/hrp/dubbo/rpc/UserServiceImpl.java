package com.lsp.hrp.dubbo.rpc;

/**
 * @Description
 * @Author lishupeng
 * @Date 2017/10/20 14:21
 */
public class UserServiceImpl implements UserService {
    @Override
    public void registerUser(Integer id) {
        System.out.println(id);
    }
}

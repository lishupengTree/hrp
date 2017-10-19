package com.lsp.hrp.mybatis;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lishupeng on 2017/10/8.
 */
public class Test extends BaseTest {

//    @Autowired
//    private BasRoleDao basRoleDao;
    @Autowired
    EntityCreater entityCreater;

    @org.junit.Test
    public void aVoid(){
//        basRoleDao.get111();
    }

    @org.junit.Test
    public void bVoid(){
        //074C5AA0C4A746988031C0509D3D682D
//        BasRole basRole = new BasRole();
//        basRole.setId(Long.parseLong("074C5AA0C4A746988031C0509D3D682D"));
    }

    @org.junit.Test
    public void test() throws Exception{
        entityCreater.create();
    }
}

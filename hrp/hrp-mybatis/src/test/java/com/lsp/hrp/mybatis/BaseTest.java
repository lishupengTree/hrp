package com.lsp.hrp.mybatis;

import com.lsp.hrp.mybatis.util.SpringContextUtil;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;

/**
 * Created by lishupeng on 2017/10/8.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring/*-spring.xml" })
public class BaseTest {

}

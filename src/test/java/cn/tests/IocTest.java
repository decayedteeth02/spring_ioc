package cn.tests;

import cn.test.beans.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
    @Test
    public void test01(){
        ApplicationContext ioc =new ClassPathXmlApplicationContext("spring.ioc.xml");
        User bean=ioc.getBean(User.class);
        System.out.println(bean);
    }
}

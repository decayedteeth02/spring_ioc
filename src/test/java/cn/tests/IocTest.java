package cn.tests;

import cn.test.beans.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.lang.annotation.Annotation;

public class IocTest {
    ApplicationContext ioc;
    @Before
    public void before(){
        //加载spring容器
        //负责实例化，组装和配置bean
//        ApplicationContext spring的顶层核心接口
//        ClassPathXmlApplicationContext 根据项目路径的xml配置来实例化spring容器
//        FileSystemXmlApplicationContext 根据磁盘路劲的xml配置来实例化spring容器
//        AnnotationConfigApplicationContext 根据javaconfig 来配置实例化spring容器
        ioc=new ClassPathXmlApplicationContext("spring.ioc.xml");
    }


    @Test
    public void test01(){


        System.out.println("Spring已加载");
//        获取bean的方式
//        1.通过类获取bean
//        User bean=ioc.getBean(User.class);
//        2.通过bean的名字或ID获取bean
//        3.通过名字加类型
        User bean=ioc.getBean("user",User.class);

        System.out.println(bean);
    }
    @Test
    public void test02(){
        User bean=ioc.getBean("abc",User.class);
        System.out.println(bean+"1");
    }
    @Test
    public void test03(){
        User bean=ioc.getBean("user3",User.class);
        System.out.println(bean+"User3");
    }
}

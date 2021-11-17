package cn.tests;

import cn.test.beans.Person;
import cn.test.beans.User;
import cn.test.beans.Wife;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//基于ioc基于xml的高级使用


public class IocHTest {
    ApplicationContext ioc;
    @Before
    public void before(){
        //加载spring容器
        //负责实例化，组装和配置bean
//        ApplicationContext spring的顶层核心接口
//        ClassPathXmlApplicationContext 根据项目路径的xml配置来实例化spring容器
//        FileSystemXmlApplicationContext 根据磁盘路劲的xml配置来实例化spring容器
//        AnnotationConfigApplicationContext 根据javaconfig 来配置实例化spring容器
        ioc=new ClassPathXmlApplicationContext("spring-ioc-high.xml");
    }



    @Test
    public void test01(){
        System.out.println("spring已加载");
    }


//    懒加载
//    不会在spring容器加载的时候，加载该bean
    @Test
    public void test02(){
        System.out.println("spring已加载");
        Wife wife=ioc.getBean("wife",Wife.class);
        System.out.println(wife);
    }

    @Test
    public void test03(){
        System.out.println("spring已加载");
        Person person1=ioc.getBean("person",Person.class);
        Person person2=ioc.getBean("person",Person.class);
        System.out.println(person1);
    }
//    使用静态工厂实例化
    @Test
    public void test04(){
        Person person=ioc.getBean("person",Person.class);
        System.out.println(person);
    }

//    使用实例工厂实例化
    @Test
    public void test05(){
    Person person=ioc.getBean("person",Person.class);
    System.out.println(person);
}
}

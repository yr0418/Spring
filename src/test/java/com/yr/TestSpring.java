package com.yr;

import com.yr.pojo.Gril;
import com.yr.pojo.Man;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void m1(){
        //1.获取 上下文 对象，spring里面声明的对象都需要通过上下文获取
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        //扫描多个配置文件中的 bean，在 String 数组中写入对应的配置文件的名字
        //即时在不同的配置文件中，bean 的 id 也不允许相同（只限同时扫描多个配置文件的时候）
        ApplicationContext context1=new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});

        //2.通过该对象获取 bean 对象
        Gril g= (Gril) context.getBean("gril");

        //3.指定 gril1 的类型，无需强制转换
     //   Gril g1=context1.getBean("gril",Gril.class);

      //通过别名获取 bean
        Gril g2=context.getBean("g2",Gril.class);
        /**
         * spring 默认是单例的方式来创建 bean，在本例中，g，g2 为同一个bean，其初始化函数只执行了一次
         */

        System.out.println(g);
        System.out.println(g2);

        //关闭 IOC 容器，销毁该容器中的所有 bean
//        ((ClassPathXmlApplicationContext)context).close();

        //刷新该容器，销毁该容器中的所有 bean，同时新注入所有 bean
//        ((ClassPathXmlApplicationContext)context).refresh();
    }
    @Test
    public void m2(){
        //1.获取 上下文 对象，spring里面声明的对象都需要通过上下文获取
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        Man man=context.getBean("man",Man.class);
    }
}

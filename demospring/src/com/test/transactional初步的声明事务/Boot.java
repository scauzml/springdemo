package com.test.transactional初步的声明事务;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 张明亮
 * @date 2018/8/31 15:18
 */
public class Boot {
    public static void main(Strig args[] ){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml", Boot.class);
        FooService fooService = (FooService) applicationContext.getBean("fooService");
        fooService.getFoo("a");
    }
}

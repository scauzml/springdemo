package com.test.transactional使用注解Trancactional来声明事务的处理.多个事务处理器;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author 张明亮
 * @date 2018/8/31 16:41
 */
public class FooServiceManager {
    @Transactional("order")
    public void setSomething(String name){}

    @Transactional("account")
    public void doSomething(String name) {

    }
}

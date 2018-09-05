package com.test.transactional使用注解Trancactional来声明事务的处理;

import com.test.transactional初步的声明事务.FooService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 张明亮
 * @date 2018/8/31 15:37
 */
@Transactional(readOnly = true)//默认为false
public class DefaultFooServiceImpl implements FooService {

    @Override
    public Foo getFoo(String fooName) {
        return null;
    }

    @Override
    public Foo getFoo(String fooName, String barName) {
        return null;
    }

    @Override
    public void insertFoo(Foo foo) {

    }
    /*propagation有待研究，方法上的事务定义高于类方法上的定义*/
    @Transactional(readOnly = false,propagation = Propagation.MANDATORY)
    @Override
    public void updateFoo(Foo foo) {

    }
}

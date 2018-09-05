package com.test.transactional初步的声明事务;

/**
 * @author 张明亮
 * @date 2018/8/31 14:49
 */
public interface FooService {
    /**
     * @author {张明亮}
     * @date 2018-08-31 14:50
     * @param null
     * @return 
     * @throws
     * @description {}
    */
    Foo getFoo(String fooName);
    
    Foo getFoo(String fooName, String barName);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);
}

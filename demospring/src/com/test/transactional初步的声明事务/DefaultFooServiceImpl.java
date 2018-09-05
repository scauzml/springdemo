package com.test.transactional初步的声明事务;

/**
 * @author 张明亮
 * @date 2018/8/31 14:51
 */
public class DefaultFooServiceImpl implements  FooService{
/**
 * @author {张明亮}
 * @date 2018-08-31 14:53
 * @param null
 * @return
 * @throws
 * @description {get方法要在只读的事务上下文中执行}
*/
    @Override
    public Foo getFoo(String fooName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Foo getFoo(String fooName, String barName) {
        throw new UnsupportedOperationException();
    }

    /**
     * @author {张明亮}
     * @date 2018-08-31 14:53
     * @param null
     * @return
     * @throws
     * @description {insertFoo,updateFoo需要在读与写的事务上下文中执行}
    */
    @Override
    public void insertFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void updateFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }
}

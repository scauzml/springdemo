package com.test.声明式事务实例;

/**
 * @author 张明亮
 * @date 2018/9/4 11:47
 * 自定义异常封装类
 */
public class BookStockException extends RuntimeException {
    private static final long serialVersionUID=1L;

    public BookStockException() {
        super();
    }

    public BookStockException(String arg0, Throwable arg1, boolean arg2
            , boolean arg3) {
        super(arg0,arg1,arg2,arg3);
    }

    public BookStockException(String arg0, Throwable arg1) {
        super(arg0,arg1);
    }

    public BookStockException(String arg0) {
        super(arg0);
    }

    public BookStockException(Throwable arg0) {
        super(arg0);
    }
}

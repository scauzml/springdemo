package com.test.声明式事务实例;

/**
 * @author 张明亮
 * @date 2018/9/4 11:21
 */
public interface BookShopDao {
    public int findBookPriceByIsbn(String idbn);
    public void updateBookStock(String idbn);
    void updateUserAccount(String name, double account);
}

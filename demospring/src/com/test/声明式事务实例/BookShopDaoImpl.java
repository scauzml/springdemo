package com.test.声明式事务实例;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 张明亮
 * @date 2018/9/4 11:23
 */
@Repository("bookShopDao")
public class BookShopDaoImpl implements BookShopDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int findBookPriceByIsbn(String idbn) {
        String sql = "select price from book where isbn=?";
        return jdbcTemplate.queryForObject(sql,Integer.class,isbn);
    }

    @Override
    public void updateBookStock(String isbn) {

        String sql2="select stock from book_stock where isbn=?";
        int stock = jdbcTemplate.queryForObject(sql2, Integer.class, isbn);
        if (stock == 0) {
            throw new Exceptiona();
        }
    }

    @Override
    public void updateUserAccount(String name, double account) {

        //检查余额是否不足，若不足，则抛出异常
        String sql2 = "SELECT balance FROM account WHERE username = ?";
        int balance = JdbcTemplate.queryForObject(sql2, Integer.class, username);
        if (balance < price) {
            throw new UserAccountException("余额不足！");
        }
        String sql = "UPDATE account SET balance = balance - ? WHERE username = ?";
        JdbcTemplate.update(sql, price, username);
    }
}

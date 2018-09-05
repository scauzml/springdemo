package com.test.声明式事务实例;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 张明亮
 * @date 2018/9/4 11:45
 */
@Service("cashier")
public class CashierImpl implements Cashier{
    @Autowired
    private BookShopService bookShopService;
    @Transactional
    @Override
    public void checkout(String name, List<String> isbns) {
        for (String isbn:isbns) {
            bookShopService.purchase(username,isbn);
        }
    }



}

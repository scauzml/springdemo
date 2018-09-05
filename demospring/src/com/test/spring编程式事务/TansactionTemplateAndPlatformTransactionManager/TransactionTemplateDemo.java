package com.test.spring编程式事务.TansactionTemplateAndPlatformTransactionManager;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @author 张明亮
 * @date 2018/9/4 10:32
 */
public class TransactionTemplateDemo {
    public void transactionDemo() {
        TransactionTemplate tt = new TransactionTemplate();
        Object result=tt.execute(
                new TransactionCallback<Object>() {
                    @Override
                    public Object doInTransaction(TransactionStatus transactionStatus) {

                        updateOperation();
                        return resultOfupdateOperation();
                    }
                }
        );
    }
}

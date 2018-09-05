package com.test.spring编程式事务.TansactionTemplateAndPlatformTransactionManager;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * @author 张明亮
 * @date 2018/9/4 10:36
 */
public class PlatformTransactionManagerDemo {
    public void transactiondDemo() {
        //定义某一框架平台的TransactionManager,如jdbc的事务管理类
        DataSourceTransactionManager dataSourceTransactionManager=new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);//定义数据源
        //定义事务的属性
        DefaultTransactionDefinition transactionDefinition=new DefaultTransactionDefinition();
        //定义事务的传播行为
        transactionDefinition.setPropagationBehavior(DefaultTransactionDefinition.PROPAGATION_REQUIRED);
        //获得事务的状态
        TransactionStatus status = dataSourceTransactionManager.getTransaction(transactionDefinition);
        try {
            dataSourceTransactionManager.commit(status);//提交
        } catch (Exception e) {
            dataSourceTransactionManager.rollback(status);//回滚
        }

    }
}

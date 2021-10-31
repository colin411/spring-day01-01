package main.java.com.study.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author 周卓群
 * @title: TxDemoConfig003
 * @projectName spring-day01-01
 * @description: TODO 事务的配置类
 * @date 2021/10/3121:25
 */

@Configuration
@ComponentScan(basePackages = "main.java.com.study.spring.transaction.demo020")
@EnableTransactionManagement //开启事务
public class TxDemoConfig003 {

    /**
    * @name: getDruidDataSource
    * @description: TODO 创建数据库连接池
    * @params:
    null
    * @return:

     * @return: com.alibaba.druid.pool.DruidDataSource
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/31-21:29
    */

    @Bean
    public DruidDataSource getDruidDataSource() {

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/demo_database?characterEncoding=UTF-8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("zzq19960411");

        return druidDataSource;
    }

    /**
    * @name: getJdbcTemplate
    * @description: TODO 创建jdbctemplate对象
    * @params:
    null
    * @return:

     * @return: org.springframework.jdbc.core.JdbcTemplate
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/31-21:31
    */

    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        jdbcTemplate.setDataSource(dataSource);

        return jdbcTemplate;
    }

    /**
    * @name: getDataSourceTransactionManager
    * @description: TODO 创建事务管理器
    * @params:

     * @param: dataSource
    * @return:

     * @return: org.springframework.jdbc.datasource.DataSourceTransactionManager
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/31-21:34
    */

    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();

        dataSourceTransactionManager.setDataSource(dataSource);

        return dataSourceTransactionManager;
    }
}

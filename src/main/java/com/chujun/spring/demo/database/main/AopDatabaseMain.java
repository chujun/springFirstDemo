package com.chujun.spring.demo.database.main;


import com.chujun.spring.demo.database.service.Performer;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by chujun on 2015/10/19.
 */
public class AopDatabaseMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/database/spring-aop-database.xml");
        //两个表演者
        Performer juggler = (Performer) context.getBean("juggler");
        juggler.perform();
        //测试dbcp数据库
        BasicDataSource dbcp = (BasicDataSource) context.getBean("data_source_dbcp");
        try {
            Connection connection = dbcp.getConnection();
            System.out.println(connection.getClass());
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                dbcp.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        //测试jdbc数据库
        DriverManagerDataSource jdbc1=(DriverManagerDataSource)context.getBean("data_source_jdbc_driver_manager");
        try {
            Connection connection= jdbc1.getConnection();
            System.out.println(connection.getClass());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

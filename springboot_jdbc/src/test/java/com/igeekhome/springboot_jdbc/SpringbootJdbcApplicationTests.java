package com.igeekhome.springboot_jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJdbcApplicationTests {


    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void contextLoads() throws SQLException {
        //默认数据源 HikariDataSource （springboot默认的数据源）
        //System.out.println(dataSource);//懒加载
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        System.out.println("dataSource:"+dataSource);

    }

    @Test
    public void addItem(){
        Object[] params = new Object[]{4,"测试商品",3000,"性能好","",new Date()};
        jdbcTemplate.update("insert into items values(?,?,?,?,?,?)",params);

    }


    @Test
    public void queryItems(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from items");
        System.out.println(maps);
    }


}


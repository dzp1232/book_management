package cn.dzp.test;


import java.sql.Connection;

import cn.dzp.utils.DBUtils;
import org.junit.Test;


public class DBTest {
    @Test
    public void testConnection() {
        Connection conn = DBUtils.getConnection();
        if(conn!=null) {
            System.out.println("数据库连接成功呢！");
        }
    }
}
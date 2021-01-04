
package cn.dzp.utils;

import java.sql.*;
import java.util.ResourceBundle;
import javax.sql.DataSource;

 public class DBUtils {

    //数据库连接地址
    private static final String URL;
    //数据库用户名
    private static final String USERNAME;
    //数据库密码
    private static final String PASSWORD;
    //加载数据库连接驱动程序
    private static final String DRIVER;


    //加载数据库配置文件
    private static ResourceBundle rb = ResourceBundle.getBundle("db");

    //加载数据库配置文件中的连接信息
    static{
        URL = rb.getString("ms.url");
        USERNAME = rb.getString("ms.user");
        PASSWORD = rb.getString("ms.pwd");
        DRIVER = rb.getString("ms.driver");
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //创建数据库连接
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
//            System.out.println("数据库连接成功。");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("数据库连接失败，请检查数据库地址、用户名、密码是否存在错误！！！");
        }
        return con;
    }

    //关闭数据库连接
    public static void close(ResultSet rs, Statement stat, Connection con) throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (stat != null) {
            rs.close();
        }
        if (con != null) {
            rs.close();
        }
        System.out.println("数据库连接已关闭！");
    }

     public void setURL(String url) {
     }

     public void setDRIVER(String driver) {
     }

     public void setUSERNAME(String username) {
     }

     public void setPASSWORD(String password) {
     }

     public void setMaxPoolSize(String maxPoolSize) {
     }

     public void setMinPoolSize(String minPoolSize) {
     }

     public void setAutoCommitOnClose(String autoCommitOnClose) {
     }

     public void setCheckoutTimeout(String checkoutTimeout) {
     }

     public void setAcquireRetryAttempts(String acquireRetryAttempts) {
     }
 }

package cn.dzp.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            // 获取sqlSessionFactory对象
            String resource="mybatis-config.xml";
            InputStream inputStream= Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 获得sqlSession
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();

    }
}

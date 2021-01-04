package cn.dzp.test;

import cn.dzp.entity.User;
import cn.dzp.mapper.UserMapper;
import cn.dzp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void testSelect(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
       List<User> userlist = userMapper.getUserList();
        for (User user:userlist){
            System.out.println(user.toString());
        }
    }
    @Test
    public void testSelectOne(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user= userMapper.getUserById(2L);
        System.out.println(user.toString());
    }
    @Test
    public void testUpdate(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.updateUserById(new User(3L,"我去","5s45d4","男"));
        // 提交事务
        sqlSession.commit();
        sqlSession.close();

    }
   @Test
    public void testDelete(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.deleteUserById(6L);
        System.out.println("已删除！");
        // 提交事务
        sqlSession.commit();
        sqlSession.close();

    }
   @Test
    public void testInsert(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user=new User(6L,"额","13456","男", (byte) 22,2,false,"54455445");
        userMapper.addUser(user);
        System.out.println("已增加！");
        // 提交事务
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    //根据用户名密码查询用户信息
    public void selectUserByNP(){
     SqlSession sqlSession = MybatisUtils.getSqlSession();
     UserMapper mapper = sqlSession.getMapper(UserMapper.class);
     User user = mapper.selectUserByNP("小邓","321");
     System.out.println(user);

 }
    @Test
    //模糊查询
    public void testLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = userMapper.getUserListLike("%我%");
        for(User user:users){
            System.out.println(user);
        }
        sqlSession.close();
    }
}

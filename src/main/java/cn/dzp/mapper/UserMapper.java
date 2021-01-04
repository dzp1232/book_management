package cn.dzp.mapper;

import cn.dzp.entity.User;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

public interface UserMapper {
    int delUserById(long id);

     User queryById(long id);

    List<User> findAllUser();

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getUserList();

     int addUser(User user);

    void updateUserById(User user);

    void deleteUserById(long i);

    User getUserById(Long id);

    //模糊查询
    List<User> getUserListLike(String name);

    //根据用户名密码查询用户信息
    User selectUserByNP(@Param("name") String name, @Param("pwd") String pwd);

}
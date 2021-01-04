package cn.dzp.service;
import cn.dzp.entity.User;

import java.util.List;

public interface UserService {
    int addUser(User user);

    int delUserById(long id);

    int updateUser(User user);

    User queryById(long id);

    List<User> findAllUser();
}

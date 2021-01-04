/*

package cn.dzp.service.serviceImpl;
import cn.dzp.mapper.UserMapper;
import cn.dzp.entity.User;
import cn.dzp.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return UserMapper.addUser(user);
    }

    @Override
    public int delUserById(long id) {
        return UserMapper.delUserById(id);
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }


    @Override
    public User queryById(long id) {
        return UserMapper.queryById(id);
    }

    @Override
    public List<User> findAllUser() {
        return UserMapper.findAllUser();
    }

}

*/

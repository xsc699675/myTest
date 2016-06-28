package com.test.service;

import com.test.dao.UserDao;
import com.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2016/5/17.
 */
@Component
@Transactional(readOnly = true)
public class UserService {
    @Autowired
    private UserDao userDao;
    public User addUser(User user){
        return userDao.save(user);
    }
    @Query("select * from User")
    public List<User> findAll(){
        return userDao.findAll();
    }
}

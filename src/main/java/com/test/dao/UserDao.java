package com.test.dao;

import com.test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/5/17.
 */
@SuppressWarnings("All")
public interface UserDao extends JpaRepository<User,Long> {
}

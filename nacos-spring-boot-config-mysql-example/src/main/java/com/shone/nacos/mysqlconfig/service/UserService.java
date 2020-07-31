package com.shone.nacos.mysqlconfig.service;

import com.shone.nacos.mysqlconfig.dao.UserRepository;
import com.shone.nacos.mysqlconfig.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiaoguojian
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {this.userRepository = userRepository;}

    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }
}

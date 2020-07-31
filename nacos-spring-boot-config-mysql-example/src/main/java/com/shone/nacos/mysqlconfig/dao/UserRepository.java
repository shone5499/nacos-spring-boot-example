package com.shone.nacos.mysqlconfig.dao;


import com.shone.nacos.mysqlconfig.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * DemoClass
 *
 * @author Xiao GuoJian
 * @date 2020/7/31 下午3:51
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}

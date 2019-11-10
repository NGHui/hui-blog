package com.hui.dao;

import com.hui.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/10
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}

package com.hui.service;

import com.hui.po.User;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/10
 */
public interface UserService {

    /**
     * 管理员登陆
     * @param username
     * @param password
     * @return
     */
    User checkUser(String username, String password);
}

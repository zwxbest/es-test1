package com.nizouba.service;

import com.nizouba.entity.User;

/**
 * 用户服务
 * Created by 瓦力.
 */
public interface IUserService {
    User findUserByName(String userName);
}

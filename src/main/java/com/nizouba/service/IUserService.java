package com.nizouba.service;

import com.nizouba.domain.po.User;
import com.nizouba.domain.vo.response.UserDTO;

/**
 * 用户服务
 * Created by 瓦力.
 */
public interface IUserService {
    User findUserByName(String userName);


    ServiceResult<UserDTO> findById(Long userId);
}

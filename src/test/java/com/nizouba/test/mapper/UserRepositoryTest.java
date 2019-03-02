package com.nizouba.test.mapper;

import com.nizouba.test.BaseTest;
import com.nizouba.entity.User;
import com.nizouba.repository.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zwxbest on 2019/3/2.
 */
public class UserRepositoryTest extends BaseTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testUserRepository(){
        String email ="zhangweixiao@live.com";
        User user = new User();
        user.setEmail(email);
        userRepository.save(user);
        assetEqual(user.getId()!=null,true);
        User one = userRepository.findOne(user.getId());
        assetEqual(one.getEmail(),email);
    }
}

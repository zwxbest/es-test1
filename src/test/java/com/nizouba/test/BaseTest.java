package com.nizouba.test;

import com.nizouba.Application;
import com.nizouba.repository.UserRepository;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Transactional
@Ignore
@ActiveProfiles("test")
public class BaseTest {

    public <T> void assetEqual(T a,T b){
        Assert.assertThat(a, IsEqual.equalTo(b));
    }
}

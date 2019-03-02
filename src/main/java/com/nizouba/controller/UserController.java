package com.nizouba.controller;

import com.nizouba.base.ApiResponse;
import com.nizouba.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by 瓦力.
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @Autowired

    @GetMapping("/user/login")
    public String loginPage() {
        return "user/login";
    }

    @GetMapping("/user/center")
    public String centerPage() {
        return "user/center";
    }

}

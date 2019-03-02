package com.nizouba.controller;

import com.nizouba.base.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 瓦力.
 */
@Controller
public class HomeController {

    @GetMapping(value = {"/", "/index"})
    public String index(Model model) {
        model.addAttribute("name","xunwu");
        return "index";
    }

    @GetMapping(value = "/get")
    @ResponseBody
    public ApiResponse get(){
        return ApiResponse.ofMessage(200,"成功了");
    }


}

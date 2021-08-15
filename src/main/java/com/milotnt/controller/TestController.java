package com.milotnt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ZhangMing [1157038410@qq.com]
 * @date 2021/8/14
 */
@Controller
public class TestController {

    @GetMapping("/")
    public String test(){
        return "adminMain";
    }

}

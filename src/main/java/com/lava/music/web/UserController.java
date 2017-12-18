package com.lava.music.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Leon on 2017/12/12.
 */
@Controller
public class UserController {


    @RequestMapping("/user/go")
    public String toLogin(){
        System.out.print("in");
        return "user/login";
    }

    @RequestMapping("/user/main")
    public String toMain(){
        return "user/main";
    }
}

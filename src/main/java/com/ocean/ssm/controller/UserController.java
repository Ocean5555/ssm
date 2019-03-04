package com.ocean.ssm.controller;

import com.ocean.ssm.entity.User;
import com.ocean.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/3/4 19:36.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return "恭喜，success!";
    }

    @GetMapping("/{name}")
    public ModelAndView selectUser(@PathVariable("name") String name) {
        ModelAndView modelAndView = new ModelAndView("/userInfo");
        User user = userService.findUserByName(name);
        modelAndView.addObject("user",user);
        return modelAndView;
    }

    @GetMapping("/list")
    public ModelAndView selectUserList() {
        List users = new ArrayList();
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setName("ocean" + i);
            user.setUsername("preference" + i);
            user.setPassword("asdqwe" + i);
            user.setSalary(i * 10f);
            users.add(user);
        }
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("users",users);
        return modelAndView;
    }
}

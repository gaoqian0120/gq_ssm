package com.itheima.controller;

import com.itheima.entity.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    private List<User> all;

    @RequestMapping("userList.do")
    @ResponseBody
    public String user() {
        all = userService.findAll();
        return all.toString();
    }

    @RequestMapping("showData.do")
    public ModelAndView showData(){
        ModelAndView mv = new ModelAndView();

        List<User> all = userService.findAll();
        mv.addObject("all",all);
        mv.setViewName("user/find");
        return mv;
    }

}
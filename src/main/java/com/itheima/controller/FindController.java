package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/find")
public class FindController {
    @RequestMapping("find.do")
    public ModelAndView dofind() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("find/find");

        return mv;
    }
}
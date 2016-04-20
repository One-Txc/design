package com.example.design.controller;

import com.example.design.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lxh on 4/20/16.
 */
@Controller
@RequestMapping("signup")
public class SignUpController {


    private UserService userService;

    @Autowired
    public SignUpController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("")
    public String home(Model model) {
        return "signup";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String signup(HttpServletRequest request, Model model) {
        String phone = request.getParameter("phone");
        int count = userService.count(phone, "");
        if (count > 0) {
            model.addAttribute("exist", "该手机号已被使用,请换一个");
            return "signup";
        }
        return "redirect:/";
    }

}

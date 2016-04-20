package com.example.design.controller;

import com.example.design.model.User;
import com.example.design.service.CookingService;
import com.example.design.service.MenuService;
import com.example.design.service.UserService;
import com.example.design.util.UserAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by lxh on 4/13/16.
 */
@Controller
@RequestMapping("")
public class HomeController extends BaseController {

    private UserService userService;
    private MenuService menuService;
    private CookingService cookingService;

    @Autowired
    public HomeController(
            UserService userService,
            MenuService menuService,
            CookingService cookingService) {
        this.userService = userService;
        this.menuService = menuService;
        this.cookingService = cookingService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home() throws Exception {
        model.addAttribute("title", "");
        List<Cookie> cookies = new ArrayList<>(Arrays.asList(request.getCookies()));
        for (Cookie cookie : cookies) {
            if (Objects.equals(cookie.getName(), "userId")) {
                String value = cookie.getValue();
                User user = UserAuth.auth(value);
                if (user != null) {
                    model.addAttribute("currentUser", user);
                    model.addAttribute("", "");
                    return "index";
                }
            }
        }

        return "index";
    }
}

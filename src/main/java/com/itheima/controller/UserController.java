package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("queryAll")
    public String  queryAll(Model model) {
        List<User> users = userService.queryAll();
        model.addAttribute("users", users);
        return "users";
    }
    @RequestMapping("deleteById")
    public String deleteById(@RequestParam("id") Long id) {
        userService.deleteById(id);
        return "redirect:/user/queryAll";
    }

}

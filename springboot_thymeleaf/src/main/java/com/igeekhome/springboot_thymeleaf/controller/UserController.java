package com.igeekhome.springboot_thymeleaf.controller;

import com.igeekhome.springboot_thymeleaf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("/user")
@Controller
public class UserController {
    @RequestMapping("/list")
    public String list(Model model){

        /*model.addAttribute("name","张三");
        model.addAttribute("id","newid");*/

        List<User> users = new ArrayList<>();
        users.add(new User(1,"张三","1383838338",new Date(),1,"江苏无锡"));
        users.add(new User(2,"李四","1383838338",new Date(),0,"江苏无锡"));
        users.add(new User(3,"王五","1383838338",new Date(),2,"江苏无锡"));
        users.add(new User(4,"赵六","1383838338",new Date(),1,"江苏无锡"));
        users.add(new User(5,"Jack","1383666666",new Date(),2,"江苏无锡"));

        model.addAttribute("users",users);

        return "userlist";//经过页面模板引擎 添加前缀以及后缀
    }

}

package org.dubbo.controller;

import org.dubbo.bean.JsonResponse;
import org.dubbo.bean.User;
import org.dubbo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class UserController {

    @Reference
    private UserService userService;
    
    @RequestMapping("register")
    public JsonResponse register(User user) {
        userService.register(user);
        return JsonResponse.success();
    }
}

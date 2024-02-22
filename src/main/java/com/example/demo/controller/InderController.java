package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/inder")
@CrossOrigin(origins = "*", maxAge = 3600)
public class InderController {

    @Autowired
    private UserService userService;

    /**
     * 获取全部用户
     */
    @RequestMapping("/getAll")
    public Result<Map<String, Object>> getAll() {
        log.info("获取全部用户");
        List<User> users = userService.getAll();
        Map<String, Object> map = new HashMap<>();
        map.put("users", users);
        return Result.ok(map);
    }
}

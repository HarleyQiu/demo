package com.example.demo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.domain.User;

import java.util.List;

/**
 * @author 21055
 * @description 针对表【user】的数据库操作Service
 * @createDate 2024-02-21 22:57:20
 */
public interface UserService extends IService<User> {

    List<User> getAll();
}

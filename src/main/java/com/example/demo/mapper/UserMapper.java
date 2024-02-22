package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 21055
 * @description 针对表【user】的数据库操作Mapper
 * @createDate 2024-02-21 22:57:20
 * @Entity .domain.com.example.demo.domain.User
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}





package com.marktoday.multipledb.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.marktoday.multipledb.entity.User;
import com.marktoday.multipledb.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mark_
 * @className UserController
 * @description TODO
 * @date 2021/3/30  17:05
 */
@Api("对用户表CRUD")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户")
    @GetMapping("/list")
    public List<User> list(){
        Wrapper<User> wrapper = new EntityWrapper<>();
        return userService.selectList(wrapper);
    }
}

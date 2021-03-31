package com.marktoday.multipledb.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.marktoday.multipledb.annotation.DataSource;
import com.marktoday.multipledb.entity.User;
import com.marktoday.multipledb.enums.DataSourceEnum;
import com.marktoday.multipledb.mapper.UserMapper;
import com.marktoday.multipledb.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mark_
 * @className UserServiceImpl
 * @description TODO
 * @date 2021/3/30  17:08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    @DataSource(DataSourceEnum.DB2)
    public List<User> selectList(Wrapper<User> wrapper) {
        return super.selectList(wrapper);
    }
}

package com.lin.gmall.user.service.impl;

import com.lin.gmall.user.bean.UmsMember;
import com.lin.gmall.user.mapper.UserMapper;
import com.lin.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAllUser();
    }
}

package com.blog.app.Service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.blog.app.Service.UserService;
import com.blog.app.mapping.UserMapper;
import com.blog.app.po.User;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaohuyao
 * @since 2018-05-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

	
}

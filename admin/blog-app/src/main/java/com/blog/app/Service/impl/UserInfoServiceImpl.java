package com.blog.app.Service.impl;

import com.blog.app.po.UserInfo;
import com.blog.app.mapping.UserInfoMapper;
import com.blog.app.Service.UserInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
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
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
	
}

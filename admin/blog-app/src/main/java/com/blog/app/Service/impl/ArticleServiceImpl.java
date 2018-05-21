package com.blog.app.Service.impl;

import com.blog.app.po.Article;
import com.blog.app.mapping.ArticleMapper;
import com.blog.app.Service.ArticleService;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
	
}

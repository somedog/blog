package com.blog.app.Service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
@Transactional(readOnly=true)
public class ResourceService {
}

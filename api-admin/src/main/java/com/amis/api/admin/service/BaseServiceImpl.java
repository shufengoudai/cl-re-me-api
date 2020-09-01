package com.amis.api.admin.service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

public class BaseServiceImpl {
    @Resource
    protected HttpServletRequest httpServletRequest;
}

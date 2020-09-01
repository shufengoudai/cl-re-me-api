package com.amis.api.admin.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

public class BaseController {
    @Resource
    protected HttpServletRequest httpServletRequest;
}

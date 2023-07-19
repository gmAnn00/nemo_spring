package com.mynemo.nemo.common.controller;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IndexController {
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception;
}

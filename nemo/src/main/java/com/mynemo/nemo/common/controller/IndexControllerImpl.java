package com.mynemo.nemo.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mynemo.nemo.common.service.IndexService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller("indexController")
public class IndexControllerImpl implements IndexController {

	@Autowired
	private IndexService indexService;
	
    @Override
    @RequestMapping(value = "/index", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String viewName=(String)request.getAttribute("viewName");
        
        ModelAndView mav=new ModelAndView(viewName);
        int a=indexService.selectTest();
        System.out.println(a+"��񿬰� ���Ƴ�");
        return mav;
    }
}
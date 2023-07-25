package com.mynemo.nemo.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mynemo.nemo.common.service.IndexService;
import com.mynemo.nemo.common.service.IndexServiceImpl;
import com.mynemo.nemo.group.vo.GroupVO;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller("indexController")
public class IndexControllerImpl implements IndexController {
	
	HttpSession session;
	
	@Autowired
	private IndexService indexService;
	
    @Override
    @RequestMapping(value = "/index", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //session=request.getSession();
        //String user_id=(String)session.getAttribute("user_id");
    	String user_id="hong1234";
    	request.setAttribute("user_id", "hong1234");
        String viewName=(String)request.getAttribute("viewName");
        ModelAndView mav=new ModelAndView(viewName);
        
        //비로그인시
        if(user_id==null) {
        	List<GroupVO> recommendGroupList=indexService.getRecommendGroupList();
        	mav.addObject("recommendGroupList", recommendGroupList);
        	//request.setAttribute("groupList", groupList);
        } else {        	
        	// 로그인했을 때 소모임 관심사
        	List<GroupVO> interestGroupList=indexService.getInterestsGroupList(user_id);
        	mav.addObject("interestGroupList",interestGroupList);
        }

        return mav;
    }

    
	@Override
	@RequestMapping(value="/indexTest", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView indexTest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName=(String)request.getAttribute("viewName");
		ModelAndView mav =new ModelAndView(viewName);
		int a= indexService.selectTest();
		System.out.println("mariadb 테스트 값:" +a);
		return mav;
	}
    
    
}

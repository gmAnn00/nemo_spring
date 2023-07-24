package com.mynemo.nemo.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface BoardController {

	//list 조회(group_id, user_id, pagingMap 필요?)
	public ModelAndView board(@RequestParam("group_id") int group_id,
			@RequestParam("user_id") String user_id,
			HttpServletRequest request, 
			HttpServletResponse response) throws Exception;

	
}

package com.mynemo.nemo.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.mynemo.nemo.board.service.BoardService;
import com.mynemo.nemo.board.service.CommentService;
import com.mynemo.nemo.board.vo.BoardVO;
import com.mynemo.nemo.board.vo.CommentVO;

@Controller
public class BoardControllerImpl implements BoardController {
	
	//글에 첨부한 이미지 저장위치 선언
	private static String ARTICLE_IMG_DIR;
	
	@Autowired
	private BoardService boardService;
	@Autowired
	private CommentService commentService;
	@Autowired
	private BoardVO boardVO;
	@Autowired
	private CommentVO commentVO;
	
	Map groupInfo;
	HttpSession session;
	GroupInfoService groupInfoService;
	GroupMainService groupMainService;
	
	
	@Override
	public ModelAndView board(int group_id, String user_id, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		return null;
	}


}
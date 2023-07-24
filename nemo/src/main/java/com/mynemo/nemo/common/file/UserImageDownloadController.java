package com.mynemo.nemo.common.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserImageDownloadController extends HttpServlet{
	
	private static String USER_IMG_REPO;
	
    @RequestMapping(value = "/userImageDownload", method = {RequestMethod.GET,RequestMethod.POST})
    public void userImageDownload(@RequestParam("user_id") String user_id, @RequestParam("user_img") String user_img, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");		

		USER_IMG_REPO = this.getClass().getResource("").getPath();
		USER_IMG_REPO = USER_IMG_REPO.substring(1, USER_IMG_REPO.indexOf(".metadata"));
		USER_IMG_REPO = USER_IMG_REPO.replace("/", "\\");
		USER_IMG_REPO += "nemo\\src\\main\\webapp\\userImages\\";
			
		OutputStream outs = response.getOutputStream();
		String path = USER_IMG_REPO + "\\" + user_id + "\\" + user_img;
		File imageFile = new File(path);
		
		response.setHeader("Cache-Control", "no-cache");
		response.addHeader("Content-disposition", "attachment; fileName=" + user_img);
		
		FileInputStream fis = new FileInputStream(imageFile);
		// 버퍼를 이용해 8kb씩 전송
		byte[] buffer = new byte[1024*8];
		
		while(true) {
			int count = fis.read(buffer);
			// 더 이상 읽을 것이 없으면 while 문 탈출
			if(count == -1) {
				break;
			}
			outs.write(buffer, 0, count);
			
		} // end of while
		fis.close();
		outs.close();
    }
    
}

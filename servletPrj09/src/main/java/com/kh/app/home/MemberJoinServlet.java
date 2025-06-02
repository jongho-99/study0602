package com.kh.app.home;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/join")
public class MemberJoinServlet extends HttpServlet{
	
	
	//doGet() @WebServlet("")으로 요청이 들어온 경우에 사용자에게 회원가입 웹 보여주기
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/WEB-INF/views/member/join.jsp").forward(req, resp);
		
	}
	
	//doPost() doGet() 메서드로 보여준 웹에서 사용자 입력에 대한 처리 진행 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//data
		String userId = req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");
		String userNick = req.getParameter("userNick");
		
		//service (db에 insert되었고 결과로 1이 반환되었다고 가정)
		int result = 1;
		
		//result
		if(result != 1) {
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
			return;
		}
		req.setAttribute("login_msg", "회원가입 성공!!");
		req.getRequestDispatcher("/WEB-INF/views/member/join_ok.jsp").forward(req, resp);
		
		
	}
}

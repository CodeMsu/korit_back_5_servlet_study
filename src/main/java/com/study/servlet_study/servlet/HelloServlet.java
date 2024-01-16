package com.study.servlet_study.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//웹은 항상 요청과 응답에 의해 이루어진다.(항상 응답이 있다.)
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getMethod());
		System.out.println(request.getRequestURL()); // 풀주소 출력 
		System.out.println(request.getRequestURI()); // 서버주소 빼고 다가져옴 
		System.out.println(response.getStatus()); // 상태코드출력 
		
		response.setContentType("text/plain");
		
		System.out.println(response.getContentType());
		
		response.getWriter().println("헬로");
		
		System.out.println("요청이 들어옴 !!!");
	}

}

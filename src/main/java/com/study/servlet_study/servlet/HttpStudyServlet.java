package com.study.servlet_study.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.servlet_study.utils.ParamsConverter;


@WebServlet("/http")
public class HttpStudyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HttpStudyServlet() {
        super();
        
    }
    // Http 메소드
    // Post요청   -> C reate(추가)
    // GET요청    -> R ead(조회)
    // PUT요청    -> U pdate(수정)
    // DeLETE요청 -> D elete(삭제)
    // 로그인 = post 요청
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    	Map<String, String> paramsMap = new HashMap<>();
    	
    		request.getParameterMap().forEach((k, v) -> {
    			StringBuilder builder = new StringBuilder();
    			
    		Arrays.asList(v).forEach(value -> builder.append(value));
    		// asList = 변수값을 리스트로 변환 
    		
    		paramsMap.put(k, builder.toString());
   
    		});
    		
    	System.out.println(paramsMap);
    	System.out.println(request.getParameter("name"));
    	
    	Map<String, String> paramsMap2 = new HashMap<>();
    	Iterator<String> ir = request.getParameterNames().asIterator(); 
    	while(ir.hasNext()) {
    		String key = ir.next();
    		paramsMap2.put(key, request.getParameter(key));
    	}
    	
    	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String> paramsMap = ParamsConverter.convertParamsMaptoMap(request.getParameterMap());
		
	System.out.println(paramsMap);
	
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPut(req, resp);
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doDelete(req, resp);
	}

}

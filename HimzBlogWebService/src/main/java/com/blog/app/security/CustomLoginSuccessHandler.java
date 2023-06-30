package com.blog.app.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomLoginSuccessHandler implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		HttpSession session = request.getSession();
		session.setAttribute("loginId", authentication.getName()); // 로그인한 사용자의 name
		
		// 사용자롤이면 사용자 메인페이지로, 어드민이면 어드민 메인페이지로 보낼 수 있음
		response.sendRedirect(request.getContextPath() + "/top");
	}

}

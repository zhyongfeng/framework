package com.fengfan.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

public class LoginUrlEntryPoint implements AuthenticationEntryPoint {

    public void commence(HttpServletRequest request, HttpServletResponse response,
              AuthenticationException authException) throws IOException, ServletException {
//        String targetUrl = null;
//        String url = request.getRequestURI();
//  
//        if(url.indexOf("admin_provider") != -1){
//            //未登录而访问后台受控资源时，跳转到后台登录页面
//            targetUrl = "/login_provider.jsp";
//        }else{
//            //未登录而访问前台受控资源时，跳转到前台登录页面
//            targetUrl = "/login_admin.jsp";
//        }
  
        String targetUrl = request.getContextPath() + "/login.jsp";
        response.sendRedirect(targetUrl);
    }

}

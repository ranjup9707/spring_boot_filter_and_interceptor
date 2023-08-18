package com.springboot.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class HelloInterceptor implements HandlerInterceptor
{
	
	private Logger log = LoggerFactory.getLogger(HelloInterceptor.class);
	
	//Any operation to be performed before hitting the actual request
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
		log.info("HelloInterceptor - preHandler invoked......{}:{} " + request.getRequestURI(), request.getMethod());
		return true;
	}
	
	//Any operation to be performed before sending the actual response to the client
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,@Nullable ModelAndView modelAndView) throws Exception {
		log.info("HelloInterceptor - postHandler invoked......{}:{} " + request.getRequestURI(), request.getMethod());
	}
	
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,@Nullable Exception ex) throws Exception {
		log.info("HelloInterceptor - afterCompletion invoked......{}:{} " + request.getRequestURI(), request.getMethod());
	}
}

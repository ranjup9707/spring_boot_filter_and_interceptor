package com.springboot.filter;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

@Component
//@Order(2) -> In which order the filter will be executed
public class HelloWorldFilter implements Filter
{

	Logger LOGGER = LoggerFactory.getLogger(HelloWorldFilter.class);
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
		LOGGER.info("[HelloWorldFilter] - inside doFilter() method");
		LOGGER.info("Local Port: " + request.getLocalPort());
		LOGGER.info("Server Name: " + request.getServerName());
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		LOGGER.info("Method Name: " + httpServletRequest.getMethod());
		LOGGER.info("Request URI: " + httpServletRequest.getRequestURI());
		LOGGER.info("Servlet Path: " + httpServletRequest.getServletPath());
		filterChain.doFilter(request, response);
	}
}

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

@Component
//@Order(1) -> In which order the filter will be executed
public class WorkFilter implements Filter
{
	Logger LOGGER = LoggerFactory.getLogger(WorkFilter.class);

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		LOGGER.info("[WorkFilter] - inside doFilter() method");
		chain.doFilter(request, response);
	}
	

}

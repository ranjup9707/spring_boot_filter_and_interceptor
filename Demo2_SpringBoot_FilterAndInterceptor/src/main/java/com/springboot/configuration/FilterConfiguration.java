package com.springboot.configuration;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.filter.HelloWorldFilter;

@Configuration
public class FilterConfiguration 
{
	@Bean
	public FilterRegistrationBean<HelloWorldFilter> registrationBean(){
		FilterRegistrationBean<HelloWorldFilter> registrationBean = new FilterRegistrationBean<HelloWorldFilter>();
		registrationBean.setFilter(new HelloWorldFilter());
		registrationBean.addUrlPatterns("/hello*");
		return registrationBean;
	}

}

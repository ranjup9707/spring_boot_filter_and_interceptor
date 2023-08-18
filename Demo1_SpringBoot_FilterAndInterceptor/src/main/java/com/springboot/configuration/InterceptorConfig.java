package com.springboot.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.springboot.interceptor.WorkInterceptor;
import com.springboot.interceptor.ExcludeInterceptor;
import com.springboot.interceptor.HelloInterceptor;

/*
 * The below thing can also be done using the class WebMvcConfigurationSupport but needs to be annoted
 * using the @Component annotation
 */

@Configuration
public class InterceptorConfig implements WebMvcConfigurer
{
	@Autowired
	private WorkInterceptor workInterceptor;
	
	@Autowired
	private HelloInterceptor helloInterceptor;
	
	@Autowired
	private ExcludeInterceptor excludeInterceptor;
	
	/*
	 * Whenever a new interceptor is added then it needs to be added in this method 
	 * and can specify the order
	 */
	@Override
	public void addInterceptors(InterceptorRegistry interceptorRegistry) {
		//Order the interceptor
		//interceptorRegistry.addInterceptor(generalInterceptorOne).order(1);
		//interceptorRegistry.addInterceptor(generalInterceptorTwo).order(2).addPathPatterns("/hello/**");
		
		//Allows only the path starting with /hello and /work
		interceptorRegistry.addInterceptor(workInterceptor).addPathPatterns("/work/**");
		interceptorRegistry.addInterceptor(helloInterceptor).addPathPatterns("/hello/**");
		//Exclude the path starting with /work
		interceptorRegistry.addInterceptor(excludeInterceptor).excludePathPatterns("/work/**");
	}
}

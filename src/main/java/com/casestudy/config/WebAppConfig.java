package com.casestudy.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.casestudy")
public class WebAppConfig implements WebMvcConfigurer {
	@Bean
	InternalResourceViewResolver viewResolver() {
		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
	}
	
	// We need this for the CSS to work!
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	// This maps exceptions to their corresponding views. 
	// With this, the user won't get ugly exception/stack trace pages on their browser.
	@Bean(name="simpleMappingExceptionResolver")
	public SimpleMappingExceptionResolver
	                createSimpleMappingExceptionResolver() {
	  SimpleMappingExceptionResolver r =
	              new SimpleMappingExceptionResolver();
	
	  Properties mappings = new Properties();
	  mappings.setProperty("DuplicateBBException", "duplicate_bb_error");
	  mappings.setProperty("NullPointerException", "null_user_error");
	
	  r.setExceptionMappings(mappings);  // None by default
	  r.setDefaultErrorView("catchall_error");    // No default
	  r.setExceptionAttribute("ex");     // Default is "exception"
	  r.setWarnLogCategory("example.MvcLogger");     // No default
	  return r;
	}
}

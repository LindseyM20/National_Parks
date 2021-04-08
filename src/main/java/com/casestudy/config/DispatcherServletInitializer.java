package com.casestudy.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.casestudy.config.WebAppConfig;

// Front controller pattern
public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebAppConfig.class}; // an array of classes. WebAppConfig is the one we made.
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}

package org.joseph.hello.exception;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

public class HelloAsyncUncaughtExceptionHandler implements AsyncUncaughtExceptionHandler{

	private static final Logger LOG = LoggerFactory.getLogger(HelloAsyncUncaughtExceptionHandler.class);
	
	@Override
	public void handleUncaughtException(Throwable ex, Method method, Object... params) {
		LOG.error(ex.getMessage());
		ex.printStackTrace();
	}

}

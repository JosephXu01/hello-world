package org.joseph.hello.config;

import java.util.concurrent.Executor;

import org.joseph.hello.exception.HelloAsyncUncaughtExceptionHandler;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootConfiguration
@EnableAsync
public class AsyncConfig implements AsyncConfigurer{

	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
		threadPoolTaskExecutor.setCorePoolSize(20);
		threadPoolTaskExecutor.setMaxPoolSize(1000);
		threadPoolTaskExecutor.setQueueCapacity(30);
		threadPoolTaskExecutor.initialize();
		return threadPoolTaskExecutor;
	}
	
	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return new HelloAsyncUncaughtExceptionHandler();
	}
}

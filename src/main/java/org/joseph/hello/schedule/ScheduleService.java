package org.joseph.hello.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleService {
	
	private static final Logger LOG = LoggerFactory.getLogger(ScheduleService.class);
	

	@Async
	@Scheduled(cron = "0/10 * * * * *")
	public void deviceMonitor() {
		LOG.info("ScheduleService");
	}
	
	@Async
	@Scheduled(cron = "0/10 * * * * *")
	public void deviceMonitor2() {
		LOG.info("ScheduleService2");
	}
	
	@Async
	@Scheduled(cron = "0/10 * * * * *")
	public void deviceMonitor3() {
		LOG.info("ScheduleService3");
	}
}

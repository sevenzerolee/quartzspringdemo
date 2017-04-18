package org.sevenzero.quartz.quartzspringdemo;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//			Scheduler scheduler = context.getBean("jobSchedule", Scheduler.class);
			Scheduler scheduler = context.getBean("quartzScheduler", Scheduler.class);
			scheduler.start();
		} 
		catch (SchedulerException e) {
			e.printStackTrace();
		}
		
	}
	
}

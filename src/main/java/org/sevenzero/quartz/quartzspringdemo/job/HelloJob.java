package org.sevenzero.quartz.quartzspringdemo.job;

import java.util.Date;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionException;

public class HelloJob {
	
	private static final Logger log = Logger.getLogger(HelloJob.class.getSimpleName());

	public void exec()
			throws JobExecutionException {
		
		log.info("###### Hello,  " + new Date() );
		
	}

}

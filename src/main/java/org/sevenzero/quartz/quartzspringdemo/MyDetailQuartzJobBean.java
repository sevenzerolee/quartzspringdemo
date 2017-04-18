package org.sevenzero.quartz.quartzspringdemo;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.sevenzero.quartz.quartzspringdemo.job.HelloJob;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * 
 * @author lb
 * @version 1.0.1
 * @Description
 * @date 2017年4月17日
 *
 */
public class MyDetailQuartzJobBean extends QuartzJobBean {
	
	private static final Logger logger = Logger.getLogger(MyDetailQuartzJobBean.class.getSimpleName());

	private HelloJob helloJob;

	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		logger.info("======== " + helloJob);
		helloJob.exec();

	}

	public void setHelloJob(HelloJob helloJob) {
		this.helloJob = helloJob;
	}

}
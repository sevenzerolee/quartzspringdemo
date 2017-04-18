package org.sevenzero.quartz.quartzspringdemo.job;

import java.util.Date;

import org.apache.log4j.Logger;
/**
 * 
 * @author lb
 * @version 1.0.1
 * @Description
 * @date 2017年4月18日
 * 
 * 这里的任务类不需要实现Job接口
 * 并且注意任务的方法不能带参数
 * 否则Spring会报错找不到该方法
 *
 */
public class WorldJob {
	
	private static final Logger log = Logger.getLogger(WorldJob.class.getSimpleName());

	public void execute() {
		
		log.info("$$$$$$ World, " + new Date());
		
		try {
			Thread.sleep(8L * 1000L);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}

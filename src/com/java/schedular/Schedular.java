/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.schedular;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author pc
 */
public class Schedular{
    public static void main(String[] args) throws SchedulerException {
 
	try {
   JobDetail j=JobBuilder.newJob(Executions.class).build();
   Trigger t=TriggerBuilder.newTrigger().withIdentity("CroneTrigger").withSchedule(
   SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(05).repeatForever()).build();
   
   Scheduler s=StdSchedulerFactory.getDefaultScheduler();
   s.start();
   s.scheduleJob(j,t);
   
} catch (SchedulerException e) {
    e.printStackTrace();
}
	}
}

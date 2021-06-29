/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.schedular;

import java.util.Date;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * @author pc
 */
public class Executions implements Job {
    Date downloadTime;
 @Override
	public void execute(JobExecutionContext jExeCtx) throws JobExecutionException {
		downloadTime = new Date();
		System.out.println("Email Downloaded...." + downloadTime);
	}

  
}

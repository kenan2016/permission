package com.cn.permission.job.service;

import com.cn.permission.common.service.IService;
import com.cn.permission.job.domain.JobLog;

import java.util.List;

public interface JobLogService extends IService<JobLog>{

	List<JobLog> findAllJobLogs(JobLog jobLog);

	void saveJobLog(JobLog log);
	
	void deleteBatch(String jobLogIds);
}

package com.cn.permission.job.dao;

import com.cn.permission.common.config.MyMapper;
import com.cn.permission.job.domain.Job;

import java.util.List;

public interface JobMapper extends MyMapper<Job> {
	
	List<Job> queryList();
}
package cc.mrbird.job.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_job_log")
public class JobLog {
    /**
     * 任务日志id
     */
    @Id
    @Column(name = "LOG_ID")
    private Long logId;

    /**
     * 任务id
     */
    @Column(name = "JOB_ID")
    private Long jobId;

    /**
     * spring bean名称
     */
    @Column(name = "BEAN_NAME")
    private String beanName;

    /**
     * 方法名
     */
    @Column(name = "METHOD_NAME")
    private String methodName;

    /**
     * 参数
     */
    @Column(name = "PARAMS")
    private String params;

    /**
     * 任务状态    0：成功    1：失败
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 耗时(单位：毫秒)
     */
    @Column(name = "TIMES")
    private Long times;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 失败信息
     */
    @Column(name = "ERROR")
    private String error;

    /**
     * 获取任务日志id
     *
     * @return LOG_ID - 任务日志id
     */
    public Long getLogId() {
        return logId;
    }

    /**
     * 设置任务日志id
     *
     * @param logId 任务日志id
     */
    public void setLogId(Long logId) {
        this.logId = logId;
    }

    /**
     * 获取任务id
     *
     * @return JOB_ID - 任务id
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * 设置任务id
     *
     * @param jobId 任务id
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    /**
     * 获取spring bean名称
     *
     * @return BEAN_NAME - spring bean名称
     */
    public String getBeanName() {
        return beanName;
    }

    /**
     * 设置spring bean名称
     *
     * @param beanName spring bean名称
     */
    public void setBeanName(String beanName) {
        this.beanName = beanName == null ? null : beanName.trim();
    }

    /**
     * 获取方法名
     *
     * @return METHOD_NAME - 方法名
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * 设置方法名
     *
     * @param methodName 方法名
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    /**
     * 获取参数
     *
     * @return PARAMS - 参数
     */
    public String getParams() {
        return params;
    }

    /**
     * 设置参数
     *
     * @param params 参数
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    /**
     * 获取任务状态    0：成功    1：失败
     *
     * @return STATUS - 任务状态    0：成功    1：失败
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置任务状态    0：成功    1：失败
     *
     * @param status 任务状态    0：成功    1：失败
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取耗时(单位：毫秒)
     *
     * @return TIMES - 耗时(单位：毫秒)
     */
    public Long getTimes() {
        return times;
    }

    /**
     * 设置耗时(单位：毫秒)
     *
     * @param times 耗时(单位：毫秒)
     */
    public void setTimes(Long times) {
        this.times = times;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取失败信息
     *
     * @return ERROR - 失败信息
     */
    public String getError() {
        return error;
    }

    /**
     * 设置失败信息
     *
     * @param error 失败信息
     */
    public void setError(String error) {
        this.error = error == null ? null : error.trim();
    }
}
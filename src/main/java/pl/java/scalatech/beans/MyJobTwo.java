package pl.java.scalatech.beans;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.scheduling.quartz.QuartzJobBean;

@PersistJobDataAfterExecution
//contents (JobDataMap) re-persisted in JobStore after each execution
@DisallowConcurrentExecution
//if there is more than one trigger which are scheduling same job then to prevent race-conditions on saved data
// 
@Slf4j
public class MyJobTwo extends QuartzJobBean {
    public static final String COUNT = "count";
    @Setter
    private String name;

    @Setter
    FirstBean first;

    @Override
    protected void executeInternal(JobExecutionContext ctx) throws JobExecutionException {
        JobDataMap dataMap = ctx.getJobDetail().getJobDataMap();
        int cnt = dataMap.getInt(COUNT);
        JobKey jobKey = ctx.getJobDetail().getKey();
        log.info("jobKey : {}  cnt : {}", jobKey, cnt);
        log.info("+++   {}  ->  first {} ", name, first);
        cnt++;
        dataMap.put(COUNT, cnt);
        first.print();
    }

}
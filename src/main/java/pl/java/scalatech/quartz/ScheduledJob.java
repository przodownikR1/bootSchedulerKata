package pl.java.scalatech.quartz;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import pl.java.scalatech.beans.FirstBean;

@Slf4j
public class ScheduledJob extends QuartzJobBean {

    @Setter
    private FirstBean first;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        log.info("+++ [ executeInteral start...{}]", context);
        first.print();
    }
}
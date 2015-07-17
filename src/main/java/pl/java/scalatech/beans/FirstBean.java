package pl.java.scalatech.beans;

import java.time.LocalTime;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

@Component("first")
@Slf4j
public class FirstBean {

    public void print() {
        log.info("+++  invoke jobBean using CronTriggerFactoryBean : {}", LocalTime.now());
    }

}
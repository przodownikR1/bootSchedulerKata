package pl.java.scalatech.beans;

import java.time.LocalTime;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

@Component("two")
@Slf4j
public class TwoBean {

    public void print() {
        log.info("+++ invoke  MethodInvokingJobDetailFactoryBean {}", LocalTime.now());
    }

}
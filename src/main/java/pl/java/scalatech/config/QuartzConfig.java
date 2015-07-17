package pl.java.scalatech.config;

import javax.annotation.PostConstruct;

import lombok.extern.slf4j.Slf4j;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = { "pl.java.scalatech.beans", "pl.java.scalatech.quartz" }, includeFilters = { @Filter(Component.class) })
@ImportResource("classpath:quartzContext.xml")
@Slf4j
@Profile("xml")
public class QuartzConfig {

    @PostConstruct
    public void init() {
        log.info("+++  quartzConfig init");
    }

}

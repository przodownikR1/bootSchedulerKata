package pl.java.scalatech;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BootXmlSchedulerApplication.class)
@WebAppConfiguration
@ActiveProfiles("java")
public class BootJavaSchedulerApplicationTest {
    @Test
    public void contextLoads() throws InterruptedException {
        Thread.sleep(3000);
    }
}

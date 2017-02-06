package cz.akineta.learning.social_connect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({JHipsterProperties.class})
public class SocialApiRunner {

    public static void main(String[] args) {
        SpringApplication.run(SocialApiRunner.class, args);
    }

}
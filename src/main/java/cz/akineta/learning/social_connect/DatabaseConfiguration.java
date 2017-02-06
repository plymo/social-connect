package cz.akineta.learning.social_connect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.inject.Inject;

@Configuration
@EnableJpaRepositories
@EnableTransactionManagement
public class DatabaseConfiguration {

    private final Logger log = LoggerFactory.getLogger(DatabaseConfiguration.class);

    @Inject
    private Environment env;

   /* @Bean
    public Hibernate5Module hibernate5Module() {
        return new Hibernate5Module();
    }*/
}

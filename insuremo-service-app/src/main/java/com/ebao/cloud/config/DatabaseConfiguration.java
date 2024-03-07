package com.ebao.cloud.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableJpaRepositories(basePackages = {"com.ebao.cloud.repository"})
@EnableJpaAuditing
@EnableTransactionManagement
@EntityScan("com.ebao.cloud.domain")
@ComponentScan(value = {"com.ebao.cloud"})
public class DatabaseConfiguration {

    private final Logger log = LoggerFactory.getLogger(com.ebao.cloud.config.DatabaseConfiguration.class);

    @Bean
    public String[] jpaPackagesToScan() {
        return new String[] {"com.ebao.cloud.domain"};
    }


}

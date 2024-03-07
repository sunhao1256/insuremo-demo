package com.ebao.cloud.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseMigrator {

    private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseMigrator.class);
    public static void main(String[] args) {
        SpringApplication.run(DatabaseMigrator.class, args);
        LOGGER.info("Script execution job done, start terminating script program...");
        System.exit(0);
    }
}

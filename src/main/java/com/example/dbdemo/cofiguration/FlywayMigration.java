package com.example.dbdemo.cofiguration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.flywaydb.core.Flyway;

@Slf4j
@Configuration
public class FlywayMigration {


    @Autowired
    private DataSource dataSource;

    @PostConstruct
    @DependsOn({"dataSource"})
    public void migrate() {
        Flyway flyway = new Flyway();
        flyway.setDataSource(dataSource);
        flyway.setLocations("/migration");
        flyway.setOutOfOrder(true);
        flyway.migrate();
    }
}

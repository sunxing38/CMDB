package com.cmdb.cmdb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.cmdb.cmdb.dao")
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class CmdbApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmdbApplication.class, args);
    }

}

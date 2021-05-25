package ru.lanit.bpm.yodata.fw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "ru.lanit.bpm.yodata.domain")
@ComponentScan(basePackages = "ru.lanit.bpm.yodata")
@EnableJpaRepositories(basePackages = "ru.lanit.bpm.yodata.app.repo")
public class YodataApplication {

    public static void main(String[] args) {
        SpringApplication.run(YodataApplication.class, args);
    }
}

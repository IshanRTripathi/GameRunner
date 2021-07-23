package com.ishanrtripathi.gamerunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan({"com.ishanrtripathi.gamerunner", "com.ishanrtripathi.sampleEnterprise"})
public class GameRunnerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =SpringApplication.run(GameRunnerApplication.class, args);

        GameRunner runner = context.getBean(GameRunner.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        runner.runGame();
    }
}
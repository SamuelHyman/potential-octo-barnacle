package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationSecrets.class)
public class Demo2Application {

  public static void main(String[] args) {

    SpringApplication.run(Demo2Application.class, args);
  }

}

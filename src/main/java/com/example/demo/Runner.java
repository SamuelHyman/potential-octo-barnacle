package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements ApplicationRunner {
  private final static Logger log = LoggerFactory.getLogger(Runner.class);

  private final ApplicationSecrets secrets;

  public Runner(ApplicationSecrets secrets) {
    this.secrets = secrets;
  }

  @Override
  public void run(ApplicationArguments args) {
    log.info("running");
    log.info("secret1: {}", secrets.secret1);
    log.info("secret2: {}", secrets.secret2);
    log.info("done");
  }

}

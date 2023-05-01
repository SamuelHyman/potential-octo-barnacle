package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class ApplicationSecrets {
  @Value("${secret-1:#{null}}")
  String secret1;

  @Value("${secret-2:#{null}}")
  String secret2;
}

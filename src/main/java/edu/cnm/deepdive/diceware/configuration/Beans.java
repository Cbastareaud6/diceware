package edu.cnm.deepdive.diceware.configuration;

import java.security.SecureRandom;
import java.util.Random;
import java.util.ResourceBundle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

  @Value("${bundle-base-name}")
  private String bundleBaseName;

  @Bean
  public Random getRng() {
    return new SecureRandom();
  }

  @Bean
  public ResourceBundle getBundle() {
    return ResourceBundle.getBundle(bundleBaseName);

  }
}

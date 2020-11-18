package io.swagger.configuration;

import com.zaxxer.hikari.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

  @Value("${SPRING_DATASOURCE_URL}")
  //@Value("postgres://lyohdsvsfpgexc:6c4351a88e05e419d21952e6ed06ce42b6eeda27c00628472e2d4d0dbe2597c2@ec2-3-208-224-152.compute-1.amazonaws.com:5432/dbljlgmm7ln0ks")
  //@Value("jdbc:postgresql://@pellefant.db.elephantsql.com:5432/cwkqmdql?user=cwkqmdql&password=SsVqwdLxQObgaJAYu68O-8gTY1VmS9LX&sslmode=require")
  private String dbUrl;
  
  @Value("${SPRING_DATASOURCE_USERNAME}")
  private String username;
  
  @Value("${SPRING_DATASOURCE_PASSWORD}")
  private String password;
  

  @Value("${spring.datasource.driverClassName}")
  private String driverClassName;
  
  @Bean
  public DataSource dataSource() {
      HikariConfig config = new HikariConfig();
      config.setJdbcUrl(dbUrl);
      config.setDriverClassName(driverClassName);
      config.setUsername(username);
      config.setPassword(password);
      return new HikariDataSource(config);
  }
}
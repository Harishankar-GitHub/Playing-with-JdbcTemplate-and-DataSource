package com.jdbc.example1;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class ConfigForExample1
{
	@Bean(name = "dataSource1")
	 @ConfigurationProperties(prefix = "spring.datasource")
	 public DataSource dataSource()
	{
	  return DataSourceBuilder.create().build();
	 }

	 @Bean(name = "jdbcTemplate1")
	 public JdbcTemplate jdbcTemplate1(@Qualifier("dataSource1") DataSource dataSource)
	 {
	  return new JdbcTemplate(dataSource);
	 }
}

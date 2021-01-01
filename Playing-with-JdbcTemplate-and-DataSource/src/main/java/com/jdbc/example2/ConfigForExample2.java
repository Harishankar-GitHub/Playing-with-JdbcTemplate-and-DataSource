package com.jdbc.example2;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
//@PropertySource("classpath:application.properties")
// Uncomment this line and hover over @PropertySource for explanation and usage example.
public class ConfigForExample2
{
	@Autowired
	Environment environment;

	private final String URL = "spring.datasource.url";
	private final String USER = "spring.datasource.username";
	private final String DRIVER = "spring.datasource.driver-class-name";
	private final String PASSWORD = "spring.datasource.password";

	@Bean(name = "dataSource2")
	DataSource dataSource()
	{
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		
		driverManagerDataSource.setUrl(environment.getProperty(URL));
		driverManagerDataSource.setUsername(environment.getProperty(USER));
		driverManagerDataSource.setPassword(environment.getProperty(PASSWORD));
		driverManagerDataSource.setDriverClassName(environment.getProperty(DRIVER));
		
		return driverManagerDataSource;
	}
}

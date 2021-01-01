package com.jdbc.example3;

import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ConfigurationProperties("spring.datasource")
public class ConfigForExample3
{
	private String url;
	private String username;
	private String password;
	private String driverClassName;
	
	// Note:
	// 1. Variable name must match with the name in application.properties file.
	// 	Like.. spring.datasource.url, spring.datasource.username etc.
	
	// 2. Getters and Setters are must.
	
	@Bean(name = "dataSource3")
	DataSource dataSource()
	{
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		
		driverManagerDataSource.setUrl(this.getUrl());
		driverManagerDataSource.setUsername(this.getUsername());
		driverManagerDataSource.setPassword(this.getPassword());
		driverManagerDataSource.setDriverClassName(this.getDriverClassName());
		
		return driverManagerDataSource;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
}

package com.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.jdbc.example1.JdbcTemplateExample1;
import com.jdbc.example2.JdbcTemplateExample2;
import com.jdbc.example3.JdbcTemplateExample3;

@SpringBootApplication
public class PlayingWithJdbcTemplateAndDataSourceApplication implements CommandLineRunner
{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	JdbcTemplateExample1 jdbcTemplateExample1;
	
	@Autowired
	JdbcTemplateExample2 jdbcTemplateExample2;
	
	@Autowired
	JdbcTemplateExample3 jdbcTemplateExample3;
	
	public static void main(String[] args) {
		SpringApplication.run(PlayingWithJdbcTemplateAndDataSourceApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception
	{
		logger.info("\n Example 1 Updated rows -> {}", jdbcTemplateExample1.updateRecord());
		logger.info("\n Example 2 Updated rows -> {}", jdbcTemplateExample2.updateRecord());
		logger.info("\n Example 3 Updated rows -> {}", jdbcTemplateExample3.updateRecord());
	}

}

package com.jdbc.example2;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class JdbcTemplateExample2
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	@Qualifier("dataSource2")
	private DataSource dataSource;
	
	// Above DataSource - Autowired - Working
	// Below DataSource - Injected using constructor - Working
	
//	public JdbcTemplateExample2(@Qualifier("dataSource2") DataSource dataSource)
//	{
//		jdbcTemplate = new JdbcTemplate(dataSource);
//	}

	public int updateRecord()
	{
		return jdbcTemplate.update("update people set first_name = ?", new Object[] {"Harish - 2"});
	}	
}

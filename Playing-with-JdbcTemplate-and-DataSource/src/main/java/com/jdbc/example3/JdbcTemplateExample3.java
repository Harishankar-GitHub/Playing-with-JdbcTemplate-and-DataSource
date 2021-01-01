package com.jdbc.example3;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class JdbcTemplateExample3
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	@Autowired
//	@Qualifier("dataSource3")
//	private DataSource dataSource;
	
	// Above DataSource - Autowired - Working
	// Below DataSource - Injected using constructor - Working
	
	public JdbcTemplateExample3(@Qualifier("dataSource3") DataSource dataSource)
	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int updateRecord()
	{
		return jdbcTemplate.update("update people set first_name = ?", new Object[] {"Harish - Example 3"});
	}	
}

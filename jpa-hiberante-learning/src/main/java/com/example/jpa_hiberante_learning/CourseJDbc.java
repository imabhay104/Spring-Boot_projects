package com.example.jpa_hiberante_learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDbc {
	@Autowired
	private JdbcTemplate springtemp;
	private static String query = """
			insert into Course values (2,'Devops','Udemy')
			""";
	private static String query1 = """
			update Course set name='Vagrant' where id=2;
			""";
	
	public void insert(Course course)
	{
		springtemp.update("insert into Course values (?,?,?)",course.getId(),course.getName(),course.getAuthor());
	}
	public void update()
	{
		springtemp.update(query1);
	}

	
}

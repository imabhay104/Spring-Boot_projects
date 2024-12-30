package com.example.jpa_hiberante_learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class CourseJDBCcmdRunne implements CommandLineRunner {
	@Autowired
	private CourseJDbc repo;
	@Autowired
	private CourseJPARepository repo1;
	@Autowired
	private CourseSpringJpaRepo repo2;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	//	repo1.insert(new Course(1,"vagrant","Udemy"));
		//System.out.println(repo1.findById(1));
		repo2.save(new Course(1,"vagrant","Udemy"));
		repo2.deleteById((long) 1);
		repo2.findById(1l);
		
		
	}
	

}

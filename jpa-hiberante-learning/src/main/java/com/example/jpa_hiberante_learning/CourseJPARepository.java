package com.example.jpa_hiberante_learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {

	@Autowired
	private EntityManager manager;
	
	public void insert(Course course)
	
	{
		manager.merge(course);
	}
	public Course findById(long id)
	{
		return manager.find(Course.class, id);
	}
	
}

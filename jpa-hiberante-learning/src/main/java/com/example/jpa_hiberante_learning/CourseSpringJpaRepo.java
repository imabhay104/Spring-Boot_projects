package com.example.jpa_hiberante_learning;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseSpringJpaRepo extends JpaRepository<Course, Long>{
		public Course findByAuthor();

}

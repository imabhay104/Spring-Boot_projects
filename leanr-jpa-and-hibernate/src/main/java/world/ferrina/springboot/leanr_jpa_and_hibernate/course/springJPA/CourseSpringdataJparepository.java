package world.ferrina.springboot.leanr_jpa_and_hibernate.course.springJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import world.ferrina.springboot.leanr_jpa_and_hibernate.course.Course;

public interface CourseSpringdataJparepository extends JpaRepository<Course, Long> 
{
	List<Course> findByName(String name);
	
}

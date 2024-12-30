package world.ferrina.springboot.leanr_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import world.ferrina.springboot.leanr_jpa_and_hibernate.course.springJPA.CourseSpringdataJparepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJDBCRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringdataJparepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(2,"Java","Udemy"));
		repository.save(new Course(1,"AWS","Udemy"));
		repository.save(new Course(3,"DevOps","Udemy"));
		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
		System.out.println("--".repeat(20));
//	System.out.println(repository.getData());
		System.out.println("--".repeat(20));
		repository.save(new Course(4,"Abhay","Udemy"));
		System.out.println(repository.findAll());
		System.out.println("--".repeat(20));

		System.out.println(repository.findByName("Abhay"));
		
		
	}

}

package world.ferrina.springBoot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cousecontroller {
	
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses()
	{
		return Arrays.asList(
				new Course(1,"AWS","udemy"),
				new Course(2,"Spring","udemy"),
				new Course(3,"Azure","udemy")
				);
	}

}

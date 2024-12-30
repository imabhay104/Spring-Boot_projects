package com.example.RestApi.Rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
@Autowired
	private Default_vlaues values;
	@RequestMapping("/course")
	public String Courses()
	{
		return  """
				yo
				""";
	}
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses()
	{
		return Arrays.asList(
				new Course(1,"Learn Aws","Udemy"),
				new Course(2,"Learn Aws","Udemy"));
	}
	@RequestMapping("/course1")
	public Course retriveAllCourses1()
	{
		return 
				new Course(1,"Learn Aws","Udemy");
				
	}
	@RequestMapping("/default")
	public Default_vlaues get()
	{
		
		return 
				values;
				
	}
}

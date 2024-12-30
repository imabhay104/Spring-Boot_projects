package world.ferrina.FirstProject.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age, Address address){}; 
record Address(String firstName,String city){}; 

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name()
	{
	return "1st beam";
	}
	@Bean
	public int age()
	{
	return 20;
	}
	@Bean
	public Person person()
	{
		return new Person("Abhay",10,address1());
	}
	
	@Bean
	@Primary
	public Person person2()
	{
		return new Person(name(),age(),address1());
	}
	
	@Bean
	public Person person3(String name, int age, Address address1)
	{
		return new Person(name,age,address1);
	}
	
	
	@Bean
	public Address address1()
	{
		return new Address("Kyoto","japan");
	}
	
	@Bean
	public Address address2()
	{
		return new Address("Kyoto1","japan1");
	}
	
	

}

package world.ferrina.FirstProject.helloWorld;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("person2"));
			System.out.println(context.getBean(Person.class));

			System.out.println(context.getBean("address2",Address.class));
			System.out.println("$".repeat(5));
			Arrays.stream(context.getBeanDefinitionNames()).forEach(s->System.out.println(s));
//		List<String> array=Arrays.asList(context.getBeanDefinitionNames());
//		System.out.println("$".repeat(5));
//		array.forEach(s->System.out.print(s));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}

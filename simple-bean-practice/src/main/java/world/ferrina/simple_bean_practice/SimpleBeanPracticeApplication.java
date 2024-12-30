package world.ferrina.simple_bean_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SimpleBeanPracticeApplication {

	public static void main(String[] args) {
		var context=SpringApplication.run(SimpleBeanPracticeApplication.class, args);
		
		//var context = new AnnotationConfigApplicationContext(Showroom.class);
//		System.out.println("hii");
//		 System.out.println(context.getBean(Vehicle.class).Features());
//	        Bike xpulse = new Xpulse("X pulse 200 4V",1001,120);
//	        Showroom bike=new Showroom(xpulse);
//	        bike.showfeatures();
		 Showroom showroom = context.getBean(Showroom.class);
		    String features = showroom.showfeatures();
		    System.out.println("Output from Showroom: " + features);
	}

}

package world.ferrina.springBoot.learn_spring_boot;

import org.springframework.stereotype.Component;

@Component
public record Course(long id,String name,String author) {
	
}

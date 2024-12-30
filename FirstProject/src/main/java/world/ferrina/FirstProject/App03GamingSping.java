package world.ferrina.FirstProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import world.ferrina.FirstProject.game.GameRunner;
import world.ferrina.FirstProject.game.GamingConsole;
import world.ferrina.FirstProject.game.Mariogame;
import world.ferrina.FirstProject.game.PacManGame;
import world.ferrina.FirstProject.game.SuperContraGame;

public class App03GamingSping {

	public static void main(String[] args) {
		
var context=new AnnotationConfigApplicationContext(GamingConfigurations.class);
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
	

	}

}

package world.ferrina.FirstProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import world.ferrina.FirstProject.game.GameRunner;
import world.ferrina.FirstProject.game.GamingConsole;
import world.ferrina.FirstProject.game.Mariogame;
import world.ferrina.FirstProject.game.PacManGame;
import world.ferrina.FirstProject.game.SuperContraGame;

public class App01GamingBasics {

	public static void main(String[] args) {
		var marioGame = new Mariogame();
		var game = new SuperContraGame();
		var gameNew = new PacManGame();
		var gameRunner = new GameRunner(gameNew);
		gameRunner.run();
		

	}

}

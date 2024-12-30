package world.ferrina.FirstProject.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class GameRunner {
	private GamingConsole game;
	 public GameRunner( GamingConsole game)
	 {
		 this.game=game;
	 }
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game = "+ game.getClass().getSimpleName());
		game.up();
		game.down();
		game.left();
		game.right();
	}

}

package world.ferrina.FirstProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import world.ferrina.FirstProject.game.GameRunner;
import world.ferrina.FirstProject.game.GamingConsole;
import world.ferrina.FirstProject.game.Mariogame;
import world.ferrina.FirstProject.game.PacManGame;
import world.ferrina.FirstProject.game.SuperContraGame;
@Configuration
public class GamingConfigurations {
	@Bean
	public GamingConsole game()
	{
		var game = new Mariogame();
		return game;
	}
	@Bean
	public GameRunner gamerun(GamingConsole game)
	{
		var gamreun = new GameRunner(game);
		return gamreun;	
	}
	

}

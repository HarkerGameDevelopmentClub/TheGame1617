package game;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import levels.Level;

/**
 * @author Adriano Hernandez
 * @version 1.0 alpha
 * @date 11 September 2016
 ****************************
 * An instance of a game.
 */
public class Game {
	
	private List<Level> $levels;
	Main main;
	
	public Game(Main main){
		this.main = main;
	}

	protected List<Level> getLevels() {
		return $levels;
	}
	protected void setLevels(List<Level> $levels) {
		this.$levels = $levels;
	}
	protected void setLevels(Level...$levels) {
		this.$levels = new ArrayList(Arrays.asList($levels));
	}
	
	public void tick(){
		
	}
	
	public void draw(GraphicsContext gc){
		gc.setFill(Color.BLACK);
		gc.fillRect(0, 0, main.WIDTH, main.HEIGHT);
	}
}

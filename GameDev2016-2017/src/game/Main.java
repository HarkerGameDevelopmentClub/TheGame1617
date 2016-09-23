package game;
import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

/**
 * @author Adriano Hernandez
 * @version 1.0 alpha
 * @date 11 September 2016
 ****************************
 * This is the main entrypoint of the program.
 */
public class Main extends Application {

	//default window params
	
	public double WIDTH;
	public double HEIGHT;
	
	Scene scene;
	GraphicsContext gc;
	int tick = 0;
	Game game;
	
	//main entrypoint into the game
	public static void main(String[]args){
		launch(args);
		System.out.println("foobar");
	}

	@Override
	public void start(Stage stage) {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		WIDTH = screenSize.getWidth();
		HEIGHT = screenSize.getHeight();
		
		stage.setTitle("Game");
    	
    	Group root = new Group();
        scene = new Scene(root);
        stage.setScene(scene);
        
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);
        gc = canvas.getGraphicsContext2D();
        
        game = new Game(this);
        
        new AnimationTimer(){
        	@Override
            public void handle(long currentNanoTime){
            	tick++;
            	game.tick();
            	game.draw(gc);
            }
        }.start();
        
        stage.show();
	}
}

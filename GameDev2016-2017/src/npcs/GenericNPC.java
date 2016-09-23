package npcs;

import javafx.scene.canvas.GraphicsContext;

public class GenericNPC {
	
	NPCState[] states;
	double x;
	double y;
	
	public GenericNPC(double x, double y, NPCState... states){
		this.states = states;
		this.x = x;
		this.y = y;
	}
	
	public void draw(GraphicsContext gc, int timeLine){
		try {
			gc.drawImage(states[timeLine].getImage(), x, y);
		}
		catch (NullPointerException e){
		}
	}

}

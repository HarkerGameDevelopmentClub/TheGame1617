package blocks;

import images.Image;
import javafx.scene.canvas.GraphicsContext;

public class GenericBlock {

	BlockState[] states;
	double x;
	double y;
	
	public GenericBlock(double x, double y, BlockState... states){
		this.states = states;
		this.x = x;
		this.y = y;
	}
	
	public void draw(GraphicsContext gc, int timeLine){
		Image image = states[timeLine].getImage();
		if(image != null)
			gc.drawImage(image, x, y);
	}
	
}

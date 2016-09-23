package blocks;

import images.Image;

public abstract class BlockState {

	protected double health = 0.0;
	protected boolean canInteract = false;
	protected Image image = null;
	
	public abstract void interact();
	public abstract void damage(double dmg);
	
	public boolean canInteract(){
		return canInteract;
	}
	
	public double getHealth(){
		return health;
	}
	
	public Image getImage(){
		return image;
	}
	
	public void setImage(Image image){
		this.image = image;
	}
	
	public void destroy(){
		
	}
	
}

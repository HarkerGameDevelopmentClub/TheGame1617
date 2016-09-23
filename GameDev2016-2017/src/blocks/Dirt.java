package blocks;

public class Dirt extends BlockState {

	public Dirt(){
		this.health = 1;
		this.canInteract = false;
	}

	@Override
	public void interact() {
		
	}

	@Override
	public void damage(double dmg) {
		health -= dmg;
		if(health <= 0)
			this.destroy();
	}

}

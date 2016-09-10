/**
 ****************************
 * @author Adriano Hernandez
 * @version 1.0 alpha
 * @date 9 September 2016
 ****************************
 * This is the abstract class from which sprite type objects will be based.
 * A sprite is effectivelly any game object which is to be displayed.  Most
 * will have some sort of interaction with the rest of the game, but a sprite
 * can also be for purely aesthetic purposes.  Examples would be: the player,
 * a coin, a wall, a building in the background.
 ****************************
 * This is an abstract from which to expand, so it has no initialization code.
 */
public abstract class Sprite {

	//cartesian coordinates for the position of the sprite; use getter and setter for more ease of use
	private double $xpos;
	private double $ypos;
	private Image $image;
	
	abstract void display();
	
	//coordinates' getters and setters; these are public
	public double getXPosition() { return $xpos; };
	public void setXPosition(double $xpos) { this.$xpos = $xpos; };
	public double getYPosition() { return $ypos; };
	public void setYPosition(double $ypos) { this.$ypos = $ypos; };
	//image's getters and setters
	public Image getImage() { return $image; };
	public void setImage(Image $image) { this.$image = $image; };
}

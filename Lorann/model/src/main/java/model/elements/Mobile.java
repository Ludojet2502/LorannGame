package model.elements;

import model.graphics.Sprite;

/**
 * <h1>The Class Mobile represents a movable object.</h1>
 *
 * @author Matthieu CARTERON matthieu.carteron@viacesi.fr
 * @version 1.0
 */
public class Mobile extends Object {
	
	/**
     * Instantiates a new Mobile.
     *
     * @param sprite
     *            the sprite
     */
	public Mobile(Sprite sprite) {
		super(sprite);
	}
	
	/**
     * Moves the mobile right by handling collision
     */
	public void moveRight() {
        this.setX(this.getX() + 1);
	}
	
	/**
     * Moves the mobile left by handling collision
     */
	public void moveLeft() {
        this.setX(this.getX() - 1);
	}
	
	/**
     * Moves the mobile up by handling collision
     */
	public void moveUp() {
        this.setX(this.getY() + 1);
	}
	
	/**
     * Moves the mobile down by handling collision
     */
	public void moveDown() {
        this.setX(this.getY() - 1);
	}
}

package model.elements;

import model.graphics.Sprite;

/**
 * <h1>The Class Lorann represents the controllable character.</h1>
 *
 * @author Matthieu CARTERON matthieu.carteron@viacesi.fr
 * @version 1.0
 */
public class Lorann extends Mobile {
	
	/** The life state of the character. */
	private boolean alive;
	
	/**
     * Instantiates a new Lorann.
     */
	public Lorann(Sprite sprite) {
		super(sprite);
		this.alive = true;
	}
	
	/**
     * Gets the life state.
     *
     * @return the life state
     */
	public boolean IsAlive() {
		return this.alive;
	}
}

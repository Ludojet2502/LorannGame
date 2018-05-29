package model.elements;

import model.graphics.Sprite;

/**
 * <h1>The Class Object represents a placeable object.</h1>
 *
 * @author Matthieu CARTERON matthieu.carteron@viacesi.fr
 * @version 1.0
 */
public class Object {
	
	/** The X position. */
	int x;
	
	/** The Y position. */
	int y;
	
	/** The solidity. */
	boolean solid;
	
	/** The sprite. */
	Sprite sprite;
	
	/**
     * Instantiates a new Object.
     *
     * @param sprite
     *            the sprite
     */
	public Object(Sprite sprite) {
		this.sprite = sprite;
	}
	
	/**
     * Gets the X position.
     *
     * @return the X position
     */
	public int getX() {
		return x;
	}
	
	/**
     * Sets the X position.
     *
     * @param x
     *            the X position
     */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
     * Gets the Y position.
     *
     * @return the Y position
     */
	public int getY() {
		return y;
	}
	
	/**
     * Sets the Y position.
     *
     * @param y
     *            the Y position
     */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
     * Gets the solidity.
     *
     * @return the solidity
     */
	public boolean getSolid() {
		return solid;
	}
	
	/**
     * Sets the solidity.
     *
     * @param solid
     *            the solidity
     */
	public void setSolid(boolean solid) {
		this.solid = solid;
	}
}

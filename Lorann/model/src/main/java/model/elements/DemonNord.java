package model.elements;

import model.graphics.Sprite;

/**
 * <h1>The Class DemonNord represents a collectable item.</h1>
 *
 * @author Matthieu CARTERON matthieu.carteron@viacesi.fr
 * @version 1.0
 */
public class DemonNord extends Object implements IMobile {

	/**
     * Instantiates a new DemonNord.
     */
	public DemonNord(int x, int y, final Sprite sprite) {
		super(x, y, false, sprite);
	}
}

package model.graphics;

import java.awt.Image;

/**
 * <h1>The Class Sprite contains one or more images.</h1>
 *
 * @author Matthieu CARTERON matthieu.carteron@viacesi.fr
 * @version 1.0
 */
public class Sprite {

	/** The multiple images. */
	java.util.ArrayList<Image> images;
	
	/** The animation speed. Set it to 0 if no animation. */
	int animSpeed;
	
	/**
     * Instantiates a new Sprite.
     *
     * @param animSpeed
     *            the animation speed
     */
	public Sprite(int animSpeed) {
		this.animSpeed = animSpeed;
	}
	
	/**
     * Append a new image to the Sprite
     *
     * @param image
     *            the image
     */
	public void AppendImage(Image image) {
		this.images.add(image);
	}
}

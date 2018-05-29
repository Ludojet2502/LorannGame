package model;

import java.sql.SQLException;

import model.dao.ElementDAO;

/**
 * <h1>The Class Scene represents the game scene with its elements.</h1>
 *
 * @author Julien LIGUORI julien.liguori@viacesi.fr
 * @version 1.0
 */
public class Scene {
	
	 /** The width. */
    private int         width;

    /** The height. */
    private int         height;

    /** The array of objects */
    private Object[][]	object;
    
    /**
     * Instantiates a new Scene.
     * 
     * @throws SQLException
     */
    public Scene() throws SQLException {
        super();
        
        this.object = new Object[20][12];
        
        this.loadLevel(1);
    }

    /**
     * Load a level from database
     * 
     * @throws SQLException
     */
	private void loadLevel(final int level) throws SQLException {
		for (int y = 0; y < 12; y++) {
			for (int x = 0; x < 20; x++) {
				setObjectXY(ElementDAO.getElementByPos(level, x, y), x, y);
			}
		}
	}
    
    /**
     * Gets the width.
     *
     * @return the width
     */
    public final int getWidth() {
        return this.width;
    }

    /**
     * Sets the width.
     *
     * @param width
     *            the new width
     */
    private void setWidth(int width) {
        this.width = width;
    }

    /**
     * Gets the height.
     *
     * @return the height
     */
    public final int getHeight() {
        return this.height;
    }

    /**
     * Sets the height.
     *
     * @param height
     *            the new height
     */
    private void setHeight(int height) {
        this.height = height;
    }
    
    /**
     * Gets an object at position.
     *
     * @param x
     *            the X position
     * @param y
     *            the Y position
     * @return the element at the position
     */
    public final Object getObjectXY(int x, int y) {
        return this.object[x][y];
    }

    /**
     * Sets an object at position.
     *
     * @param object
     *            the object
     * @param x
     *            the X position
     * @param y
     *            the Y position
     */
    public final void setObjectXY(final Object object, int x, int y) {
        this.object[x][y] = object;
    }
}

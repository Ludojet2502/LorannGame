package view;

import java.sql.SQLException;

import model.dao.ElementDAO;

public class Scene {
	 /** The width. */
    private int         width;

    /** The height. */
    private int         height;

    /** Le Tableau */
    private Object[][] Objects;
    /**
     * Instantiates a new road with the content of the file fileName.
     *
     * @param fileName
     *            the file name where the map of the road is
     * @throws SQLException
     */
    public Scene(final String fileName) throws SQLException {
        super();
        int y = 0;
        this.loadBDD();
    }

	private void loadBDD() throws SQLException {
		for (int y = 0; y < 12; y++) {
			for (int x = 0; x < 20; x++) {
				setObjects(ElementDAO.getElementByPos(x,y),x,y);
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
    private void setWidth(final int width) {
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
    private void setHeight(final int height) {
        this.height = height;
    }
    
    /**
     * Gets the on the road XY.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @return the on the road XY
     */
    public final Object getObjectXY(final int x, final int y) {
        return this.Objects[x][y];
    }

    /**
     * Sets the on the road XY.
     *
     * @param element
     *            the element
     * @param x
     *            the x
     * @param y
     *            the y
     */
    //remplire le tableau des element
    public final void setObjectXy(final Object object, final int x, final int y) {
        this.Objects[x][y] = object;
    }
}

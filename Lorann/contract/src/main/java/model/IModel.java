package model;

import java.sql.SQLException;
import java.util.List;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

    /**
     * Gets the Element by position.
     *
     * @param x
     *            the X position
     * @param y
     *            the Y position
     * @return the Element by position
     * @throws SQLException
     *             the SQL exception
     */
    Element getElementByPos(int x, int y) throws SQLException;

    /**
     * Gets the all Elements.
     *
     * @return the all Elements
     * @throws SQLException
     *             the SQL exception
     */
    List<Element> getAllElements() throws SQLException;
}

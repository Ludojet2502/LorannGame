package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Element;

/**
 * <h1>The Class ElementDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class ElementDAO extends AbstractDAO {

    /** The sql Element by id. */
    private static String sqlElementByPos  = "{call findElementByPos(?, ?)}";

    /** The sql Element by type. */
    private static String sqlElementByType = "{call findElementByType(?)}";

    /** The sql all Elements. */
    private static String sqlAllElements   = "{call findAllElements()}";

    /** The X position column index. */
    private static int    xColumnIndex     = 1;
    
    /** The Y position column index. */
    private static int    yColumnIndex     = 2;

    /** The name column index. */
    private static int    typeColumnIndex  = 3;

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
    public static Element getElementByPos(final int x, final int y) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlElementByPos);
        Element Element = null;
        callStatement.setInt(1, x);
        callStatement.setInt(2, y);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                Element = new Element(result.getInt(xColumnIndex), result.getInt(yColumnIndex), result.getString(typeColumnIndex).charAt(0));
            }
            result.close();
        }
        return Element;
    }

    /**
     * Gets the Element by type.
     *
     * @param type
     *            the type
     * @return the Element by type
     * @throws SQLException
     *             the SQL exception
     */
    public static Element getElementByType(final char type) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlElementByType);
        Element Element = null;
        callStatement.setString(1, Character.toString(type));
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                Element = new Element(result.getInt(xColumnIndex), result.getInt(yColumnIndex), result.getString(typeColumnIndex).charAt(0));
            }
            result.close();
        }
        return Element;
    }

    /**
     * Gets the all Elements.
     *
     * @return the all Elements
     * @throws SQLException
     *             the SQL exception
     */
    public static List<Element> getAllElements() throws SQLException {
        final ArrayList<Element> Elements = new ArrayList<Element>();
        final CallableStatement callStatement = prepareCall(sqlAllElements);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
                Elements.add(new Element(result.getInt(xColumnIndex), result.getInt(yColumnIndex), result.getString(typeColumnIndex).charAt(0)));
            }
            result.close();
        }
        return Elements;
    }
}

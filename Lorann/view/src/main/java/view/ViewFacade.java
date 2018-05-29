package view;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import model.dao.ElementDAO;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {
	//tableau des element
	private Object[][] Objects;
    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    //remplire le tableau des element
    public final void setObjects(final Object object, final int x, final int y) {
        this.Objects[x][y] = object;
    }
}

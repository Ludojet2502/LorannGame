package view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

import fr.exia.insanevehicles.element.Element;
import fr.exia.insanevehicles.element.motionless.MotionlessElementsFactory;
import model.elements.IObject;
import model.
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

    private void loadBDD() {
        for (int y = 0; y < 12; y++) {
            for (int x = 0; x < 20; x++) {
            	getElementByPos(x,y);
            }
        }
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

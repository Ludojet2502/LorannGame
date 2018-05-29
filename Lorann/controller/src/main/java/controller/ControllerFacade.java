package controller;

import java.sql.SQLException;
import java.util.List;

import model.Element;
import model.IModel;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;
    
    private Lorann Lorran;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() throws SQLException {
        this.getView().displayMessage(this.getModel().getElementByPos(1, 1).toString());

        this.getView().displayMessage(this.getModel().getElementByType('g').toString());

        final List<Element> Elements = this.getModel().getAllElements();
        final StringBuilder message = new StringBuilder();
        for (final Element Element : Elements) {
            message.append(Element);
            message.append('\n');
        }
        while (Lorann.alive) {
        	this.getView().displayMessage(message.toString());
        	KeyCode.key=0;
        	if (KeyCode.key != 0) {
        		switch (KeyCode.key) {
        		case 39:
        			Lorann.moveRight();
        			break;
        		case 37:
        			Lorann.moveLeft();
        			break;
        		case 38:
        			Lorann.moveUp();
        			break;
        		case 40:
        			Lorann.moveDown();
        			break;
        		}
        	}
        }
        
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }
}

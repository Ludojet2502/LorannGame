package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyCode extends KeyAdapter {
	static int key = 0;
	public void keyPressed(KeyEvent event) {
		key = event.getKeyCode();
	}
}

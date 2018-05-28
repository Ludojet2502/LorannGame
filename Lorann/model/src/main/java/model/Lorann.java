package model;

public class Lorann {
	
	int x;
	int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void moveRight() {
        this.setX(this.getX() + 1);
	}
	public void moveLeft() {
        this.setX(this.getX() - 1);
	}
	public void moveUp() {
        this.setX(this.getY() + 1);
	}
	public void moveDown() {
        this.setX(this.getY() - 1);
	} 
}

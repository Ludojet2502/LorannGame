package model;

public class MobileMonstre extends Object{
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

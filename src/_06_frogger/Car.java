package _06_frogger;
import processing.core.PApplet;
public class Car extends PApplet{

	
	
	int x;
	int y;
	int size;
	int speed;
	
	public Car(int x, int y, int size, int speed) {
	this.x = x;
	this.y=y;
	this.size=size;
	this.speed=speed;
	}
	void display(){
	    fill(0,255,0);
	    rect(x , y,  size, 50);
	  }
	
public int getX() {
	System.out.println(x);
	return Car.x;
	
}
public int getY() {
	System.out.println(y);
	return this.y;
}
public int getSize() {
	System.out.println(size);
	return this.size;
}
}




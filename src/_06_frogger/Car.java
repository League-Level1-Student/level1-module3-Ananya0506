package _06_frogger;
import processing.core.PApplet;
public class Car extends PApplet{

	
	int x=400;
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
//	    fill(0,255,0);
//	    rect(this.x , this.y, this.size, 50);
	    
	}
	
public int getX() {
	System.out.println(x);
	return this.x;
	
}
public int getY() {
	System.out.println(y);
	return this.y;
}
public int getSize() {
	System.out.println(size);
	return this.size;
}

public void moveRight() {
this.x+=this.speed;
if(this.x>800) {
	this.x=0;
}
	}
public void moveLeft() {
this.x-=this.speed;
if(this.x<0) {
	this.x=800;
}
	}
}



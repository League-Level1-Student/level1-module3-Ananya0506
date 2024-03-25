package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x;
    int y;
    Car c1;
    Car c2;
    Car c3;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    c1 = new Car(100,100,10,50);
    c2 = new Car(200,200,10,50);
    c3 = new Car(300,300,10,50);
    }

    @Override
    public void draw() {
    	background(0, 252, 215);
    	fill(22, 82, 28);
  ellipse(x, y, 30, 30);
  System.out.println(x);
  System.out.println(y);
   StayInCanvas();
   fill(0,255,0);
   rect(x , y,  100, 50);
   Car.moveLeft(c1);
   Car.moveRight(c2);
   Car.moveLeft(c3);
    }
  
    public void StayInCanvas() {
    	if (y<=0 || y>=600) {
 y=550;
    	}
    	if (x<=0 || x>=800) {
    		 x=400;
    		    	}
    }
   
    boolean intersects(Car car) {
    	 if ((y > car.getY() && y < car.getY()+50) &&
    	                (y > car.getX() && x < car.getX()+car.getSize())) {
    	   return true;
    	  }
    	 else  {
    	  return false;
    	 }
    }
    public void keyPressed() {
       if(key == CODED){
           if(keyCode == UP)
           {
           y--;
           }
           else if(keyCode == DOWN)
           {
             y++; 
           }
           else if(keyCode == RIGHT)
           {
             x++;
           }
           else if(keyCode == LEFT)
           {
              x--;
           }
       
   }
    }
    public static void moveLeft(Car c) {
    	moveLeft(c);
    		if(x>600) {
    		x=600;
    		}
    	}
    	public static void moveRight(Car c) {
    		moveRight(c);
    		if(x>0) {
    		x=0;
    		}
    	}
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}

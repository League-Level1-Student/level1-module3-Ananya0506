package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 800;
    int Froggerx=400;
    int Froggery=30;
    int x;
    int y;
    Car c1;
    Car c2;
    Car c3;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }
    boolean intersects(Car car) {
		 if ((Froggery > car.getY() && Froggery < car.getY()+50) &&
		                (Froggerx > car.getX() && Froggerx < car.getX()+car.getSize())) {
		   return true;
		  }
		 else  {
		  return false;
		 }
    }
    
    @Override
    public void setup() {
    c1 = new Car(400,100,10,5);
    c2 = new Car(400,300,50,5);
    c3 = new Car(400,500,10,5);
    }

    
    @Override
    public void draw() {
    	background(0, 252, 215);
    	fill(22, 82, 28);
  ellipse(Froggerx, Froggery, 30, 30);
  System.out.println(Froggerx);
  System.out.println(Froggery);
   StayInCanvas();
 
//   c1.display();
//   c2.display();
//   c3.display();
   fill(0,255,0);
rect(c2.x , c2.y, 100, 50);
rect(c1.x , c1.y, 100, 50);
rect(c3.x , c3.y, 100, 50);
c1.moveLeft();
   c2.moveRight();
  c3.moveLeft();
    if(intersects(c1) == true) {
    	Froggerx = 400;
    	Froggery = 30;
    }
    
    if(intersects(c2) == true) {
    	Froggerx = 400;
    	Froggery = 30;
    }
    
    if(intersects(c3) == true) {
    	Froggerx = 400;
    	Froggery = 30;
    }
    
    }
  
    public void StayInCanvas() {
    	if (Froggery<=0 || Froggery>=800) {
 Froggery=30;
    	}
    	if (Froggerx<=0 || Froggerx>=800) {
    		 Froggerx=400;
    		    	}
    }
   
   
    public void keyPressed() {
       if(key == CODED){
           if(keyCode == UP)
           {
           Froggery-=3;
           }
           else if(keyCode == DOWN)
           {
             Froggery+=3; 
           }
           else if(keyCode == RIGHT)
           {
             Froggerx+=3;
           }
           else if(keyCode == LEFT)
           {
              Froggerx-=3;
           }
       
   }
    }
   
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}

package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x;
    int y;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	background(0, 252, 215);
    	fill(22, 82, 28);
   ellipse(x, y, 30, 30);
  System.out.println(x);
  System.out.println(y);
    }
  
    public void StayInCanvas() {
    	if (y<=0 && y>=600 && x<=0 && x>=800) {
 
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
    
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}

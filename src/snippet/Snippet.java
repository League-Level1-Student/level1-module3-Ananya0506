package snippet;

public class Snippet {
	boolean intersects(Car car) {
	 if ((frogY > car.getY() && frogY < car.getY()+50) &&
	                (frogX > car.getX() && frogX < car.getX()+car.getSize())) {
	   return true;
	  }
	 else  {
	  return false;
	 }
}


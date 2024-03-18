package _04_netflix;

public class NetflixRunner {

	public static void main(String[] args) {
		Movie one = new Movie("Leo", 3);
		Movie two = new Movie("Orion and the Dark", 1);
		Movie three = new Movie("The Mitchells vs. the Machines", 5);
		Movie four = new Movie("The Sea Beast", 2);
		Movie five = new Movie("Puss in Boots: The Last Wish", 4);
	
	one.getTitle();
	one.getRating();
	one.getTicketPrice();
	
	NetflixQueue q = new NetflixQueue();
	
	q.addMovie(one);
	q.addMovie(two);	
	q.addMovie(three);
	q.addMovie(four);
	q.addMovie(five);
	
	q.printMovies();

	
	System.out.println("The best movie is " + q.getBestMovie() + "." );
	System.out.println("The second best movie is " + q.getMovie(1) + ".");
	}
}

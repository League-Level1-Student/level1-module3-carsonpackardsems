package _05_netflix;

public class MovieRunner {
	public static void main(String[] args) {
Movie t = new Movie("Twilight", 1);
Movie n = new Movie("Newsies", 3);
Movie c = new Movie("Candace Against the Universe", 4);
Movie m = new Movie("Megamind", 5);
Movie b = new Movie("High School Musical Bad Lip Reading", 4);
String tp = t.getTicketPrice();
NetflixQueue nq = new NetflixQueue();
nq.addMovie(m);
nq.addMovie(b);
nq.addMovie(c);
nq.addMovie(n);
nq.addMovie(t);
nq.printMovies();
nq.sortMoviesByRating();
System.out.println(tp);
System.out.println("The best movie is " + nq.getMovie(0) + ".");
System.out.println("The second best movie is " + nq.getMovie(1) + ".");
}
}
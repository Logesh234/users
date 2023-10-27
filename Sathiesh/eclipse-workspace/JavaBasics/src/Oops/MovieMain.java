package Oops;

import java.util.HashSet;
import java.util.Set;

public class MovieMain {

	public static void main(String[] args) throws lowRatingMovieException {
		Movie m1=new Movie(1001,"LionKing",4.2f,3.1f,"xx");
		
		Movie m2=new Movie(1002,"RRR",3.4f,4.2f,"xx");
		
		Movie m3=new Movie(1003,"Bahubali",3.7f,4.6f,"xx");
		
		Movie m4=new Movie(1004,"Kantara",3.4f,4.8f,"xx");
		HashSet<Movie>set=new HashSet<Movie>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		for(Movie m:set)
		{
			System.out.println(m);
		}
		checkMovieRating(set);
		for(Movie m:set)
		{
			System.out.println(m);
		}
	}
	public static void checkMovieRating(Set<Movie>movieset) throws lowRatingMovieException
	{
		for(Movie m:movieset)
		{
			if(m.getRating()<4)
			{
				throw new lowRatingMovieException("movie rating low");
			}
		}
		
	}
	
	
}
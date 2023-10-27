package Comparator;

import java.util.Comparator;

public class RatingSort implements Comparator<Movie>
	{

		public int compare(Movie o1, Movie o2) {
			// TODO Auto-generated method stub
			return Float.compare(o1.getRating(), o2.getRating());
		}

}

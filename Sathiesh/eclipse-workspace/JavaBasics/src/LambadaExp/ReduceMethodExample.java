package LambadaExp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethodExample {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "c++", "j2ee",
                "datascience", "python");


Optional<String> longestString = words.stream().reduce((word1, word2)
  -> word1.length() > word2.length()
                ? word1 : word2);


longestString.ifPresent(System.out::println);


	}

}

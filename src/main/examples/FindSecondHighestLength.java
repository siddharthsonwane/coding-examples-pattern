package main.examples;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestLength {
	public static void main(String[] args) {
		String sentence = "book of india is constitution";
	    System.out.println(findLength(sentence));
	}

	private static int findLength(String sentence) {
	
		Integer lenght = Arrays.stream(sentence.split("\\s+"))
				.map(String::length)
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1).findFirst()
				.orElse(0);
		  
		return lenght;
	}
	

}

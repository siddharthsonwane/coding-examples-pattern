package main.examples;

import java.util.Arrays;

public class ReverseCharArray {
	 public static void main(String[] args) {

	        String[] names = {"Java", "Spring", "Kafka", "AWS", "Docker"};

	        System.out.println(Arrays.toString(reverse(names)));
	    }

	    private static String[] reverse(String[] names) {

	        String[] output = new String[names.length];

	        for (int i = names.length - 1; i >= 0; i--) {

	            output[i] = names[names.length - i - 1];

	        }

	        return output;
	    }
}

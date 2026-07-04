package main.examples;

import java.util.Arrays;

public class ReverseIntArray {
	  public static void main(String[] args) {

	        int[] numbers = {10, 20, 30, 40, 50};

	        System.out.println(Arrays.toString(reverse(numbers)));
	    }

	    private static int[] reverse(int[] numbers) {

	        int[] output = new int[numbers.length];

	        for (int i = numbers.length - 1; i >= 0; i--) {

	            output[i] = numbers[numbers.length - i - 1];

	        }

	        return output;
	    }
}

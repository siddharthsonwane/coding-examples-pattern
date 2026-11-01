package main.examples;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseStringArrayOrderElementsOnlyJava8 {
	public static void main(String[] args) {
        String[] array = {"Apple", "Banana", "Cherry"};

        String[] reversedArray = IntStream.range(0, array.length)
                .mapToObj(i -> array[array.length - 1 - i])
                .toArray(String[]::new);

        System.out.println(Arrays.toString(reversedArray)); 
        // Output: [Cherry, Banana, Apple]
    }

}

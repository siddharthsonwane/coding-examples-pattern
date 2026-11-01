package main.examples;

import java.util.Arrays;

public class ReverseCharactersInsideEachStringValuesOnlyJava8 {
	public static void main(String[] args) {
        String[] array = {"Apple", "Banana", "Cherry"};

        String[] reversedStrings = Arrays.stream(array)
                .map(s -> new StringBuilder(s).reverse().toString())
                .toArray(String[]::new);

        System.out.println(Arrays.toString(reversedStrings)); 
        // Output: [elppA, ananaB, yrrehC]
    }
}

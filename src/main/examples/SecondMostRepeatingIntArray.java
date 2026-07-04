package main.examples;


import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
public class SecondMostRepeatingIntArray {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 2, 1, 4, 2, 5, 1, 1};
		Optional<Map.Entry<Integer, Long>>secondMost = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
				.skip(1)
				.findFirst();
		
        secondMost.ifPresent(e ->
        System.out.println("Number: " + e.getKey() +
                           ", Frequency: " + e.getValue()));
				
	}

}

package main.examples;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringUsingJava8 {

	public static void main(String[] args) {

		String original = "Siddharth Sonwane";
		String reversed = IntStream.range(0, original.length())
                .mapToObj(i -> original.charAt(original.length() - 1 - i))
                .map(Object::toString)
                .collect(Collectors.joining());
		
		System.out.println(reversed);
	}

}

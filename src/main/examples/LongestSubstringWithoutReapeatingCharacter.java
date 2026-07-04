package main.examples;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutReapeatingCharacter {

	public static void main(String[] args) {

		String text = "siddharth";
		System.out.println(findLenghtOfLongestSubstring(text));
	}

	private static int findLenghtOfLongestSubstring(String text) {
		if(text == null) {
			return 0;
		}
		Set<Character> window = new HashSet<>();
		int left = 0, maxLength = 0;
		for(int right = 0; right < text.length(); right ++) {
			while(window.contains(text.charAt(right))){
				window.remove(text.charAt(left ++));
			}
			window.add(text.charAt(right));
			maxLength = Math.max(maxLength, right -  left + 1);
			}
		return maxLength;
	}

}

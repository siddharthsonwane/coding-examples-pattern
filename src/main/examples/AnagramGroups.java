package main.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroups {

	public static void main(String[] args) {
    
		 String[] input = {"listen", "silent", "enlist",
	                "rat", "tar", "god", "dog"};
	        System.out.println(groupAnagrams(input));
	        // [[listen, silent, enlist], [rat, tar], [god,
		
	}

    private static List<List<String>> groupAnagrams(String[] words) {
        Map<String,List<String>>map = new HashMap<>();
        for (String word : words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k ->new ArrayList<>()).add(word);
        }
        
        System.out.println(map);
        return new ArrayList<>(map.values());
    }
}

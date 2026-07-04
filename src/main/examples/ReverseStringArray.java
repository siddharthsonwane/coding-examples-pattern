package main.examples;

public class ReverseStringArray {
	public static void main(String[] args) {
		char[] example = {'i','n','d','i','a'};
		System.out.println(reverse(example));
	}

	private static char[] reverse(char[] example) {
        
		char[] outout = new char[example.length];
		
		for(int i = example.length - 1; i >= 0; i --) {
			
			outout[i] = example[example.length - i - 1];
			
		}
		
		return outout;
	}

}

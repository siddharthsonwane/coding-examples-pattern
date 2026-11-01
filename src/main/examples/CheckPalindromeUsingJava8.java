package main.examples;

public class CheckPalindromeUsingJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "madam";
		
		boolean result = str.equals(new StringBuilder(str).reverse().toString());
		
		System.out.println(":"+result);
	}

}

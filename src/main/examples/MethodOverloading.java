package main.examples;

public class MethodOverloading {

	public static void method(String s) {
		System.out.println("String");
	}

	public static void method(Integer s) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		MethodOverloading.method(null);
	}

}

package main.examples;

import java.util.Arrays;
public class SortingBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Idea
		 * 
		 * Compare adjacent elements and swap them if they are in the wrong order. The
		 * largest element "bubbles" to the end after each pass.
		 */
		/*
		 * for(int j = 0; j < n - i - 1; j++) means:
		 * 
		 * Initialization: int j = 0 → Start comparing from the first element.
		 * Condition: j < n - i - 1 → Continue while j is less than the last index that
		 * needs comparison. Update: j++ → Move to the next pair of elements. Memory
		 * Trick n → Total elements i → How many largest elements are already sorted -1
		 * → Because we compare j with j + 1
		 */
		
		int[] bubbleSortArray = {5, 3, 8, 4, 2};
		int n = bubbleSortArray.length;
		for(int i = 0; i < n - 1; i ++) {
			for(int j = 0; j < n - i - 1; j ++) {
				if(bubbleSortArray[j] > bubbleSortArray[j + 1]) {
					int temp = bubbleSortArray[j];
					bubbleSortArray[j] = bubbleSortArray[j + 1];
					bubbleSortArray[j + 1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(bubbleSortArray));
	}
}

package main.examples;

import java.util.Arrays;

public class SortingSelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Idea
		 * 
		 * Find the smallest element and place it at the beginning.
		 */

		
		int[] selectionSortArray = {5, 3, 8, 4, 2};
		int n = selectionSortArray.length;
		for(int i = 0; i < n - 1; i++) {
			int min = i;
			for(int j = i + 1; j < n; j++) {
				if(selectionSortArray[j] < selectionSortArray[min]) {
					min = j;
				}
			}
			int temp = selectionSortArray[i];
			selectionSortArray[i] = selectionSortArray[min];
			selectionSortArray[min] = temp;
		}
		System.out.println(Arrays.toString(selectionSortArray));
	}

}

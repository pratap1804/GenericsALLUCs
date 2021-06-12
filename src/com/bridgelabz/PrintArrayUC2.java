package com.bridgelabz;
public class PrintArrayUC2 {

	public static void main(String[] args) {
		Integer arr1 [] = {1,2,3,4,5};
		Double arr2[] = {1.1,1.2,1.3,1.4,1.5};
	 	Character arr3 [] = {'a','e','i','o','u'};
	 	toPrint(arr1);
		toPrint(arr2);
		toPrint(arr3);
	}

	private static <E> void toPrint(E[] arr1) {
		for(E i :arr1) {
			System.out.println(i);
		}
	}
}

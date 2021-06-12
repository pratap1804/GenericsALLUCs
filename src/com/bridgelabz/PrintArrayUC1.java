package com.bridgelabz;

public class PrintArrayUC1 {
		 public static void main(String[] args) {
				int arr1 [] = {1,2,3,4,5};
				double arr2[] = {1.1,1.2,1.3,1.4,1.5};
			 	char arr3 [] = {'a','e','i','o','u'};
			 	toPrint(arr1);
				toPrint(arr2);
				toPrint(arr3);
				}
		
	 	private static void toPrint(int[]arr1) {
		for(int i = 0; i<arr1.length; i++) {
 		 	System.out.println(arr1[i]);
			}
	 	}
	 	
	 	private static void toPrint(double [] arr2){
	 		for(int i =0; i<arr2.length;i++) {
 		 System.out.println(arr2[i]);
	 		}
	 	}
	 	
	 	private static void toPrint(char [] arr3) {
 	 for(int i = 0; i<arr3.length;i++) {
 		 System.out.println(arr3[i]);
 	 }
	}
}

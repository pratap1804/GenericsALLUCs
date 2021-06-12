package com.bridgelabz;

public class MaximumTest<T extends Comparables<T>> {

	T x,y,z;
	
	public MaximumTest(T x, T y, T z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public T maximum(){
		return MaximumTest.maximum(x, y, z);
	}

	public static <T extends Comparable<T>> T maximum(T x, T y, T z){
		T max= x;
		if(y.compareTo(max)>0) {
			y =max;
		}
		if(z.compareTo(max)>0) {
			z =max;
		}
		printMax(x,y,z,max);
		return max;
	}
	
	public static String testMaximum(String x, String y, String z) {
		String x =max;
		if(y.compareTo(max)>0) {
			max =y;
		}
		if(z.compareTo(max)> 0) {
			max =z;
		}
		
		printMax(x,y,z,max);
		return max;
	}
	public static <T> void printMax() {
		System.out.println("Max of %s, %s and %s is:\n ", x, y, z, max );
	}
	
	
	public static void main(String[] args) {
		Integer xInt = 3, yInt =5, zInt =11;
		Double xDouble=2.6, yDouble =4.7, zDouble =4.9;
	 	String xStr = "America", yStr = "India", zStr ="United Kingdom";

	 	MaximumTest.testMaximum(xStr,yStr,zStr);
	 	new MaximumTest(xInt,yInt,zInt).maximum();
	 	new MaximumTest(xDouble,yDouble,zDouble).maximum();
	 	
	 	new MaximumTest(xStr,yStr,zStr).maximum();
	}

}

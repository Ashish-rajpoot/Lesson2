package com.simplilearn.arrays;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] ints = new int[2][3];
		ints[0][0] = 200;
		ints[0][1] = 300;
		ints[0][2] = 400;
		ints[1][0] = 500;
		ints[1][1] = 600;
		ints[1][2] = 600;
		System.out.println("row length :" + ints.length);
		System.out.println("Column length : " + ints[0].length);
		System.out.println("Column length : " + ints[1].length);
		int size = ints.length;
		for (int i = 0; i<size; i++) {
			for (int j= 0; j<ints[i].length;j++) {
				System.out.println("Element : " + ints[i][j]);
			}
		}
		int[][] ints1 = {{1,2,3},{4,5,6}};
		//jagged arrary
		int[][] ints2 = {{11,12},{13,14,15}};
		System.out.println("row length :" + ints2.length);
		System.out.println("Column length : " + ints2[0].length);
		System.out.println("Column length : " + ints2[1].length);
		
	}
}

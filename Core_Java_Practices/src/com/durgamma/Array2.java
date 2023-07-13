package com.durgamma;

public class Array2 {
	public static void main(String[] args) {
		int s[][]= {{1,2,3},{2,3,4},{3,4,5}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}
	}
}

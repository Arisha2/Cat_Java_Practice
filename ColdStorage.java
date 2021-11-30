package com.java_cat;

import java.util.Scanner;

public class ColdStorage {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ColdStorage cs = new ColdStorage();
		System.out.println("Enter the no of products: ");
		int no = s.nextInt();
		System.out.println("Enter the temperatures of product respectively: ");
		int arr[]=new int[no];
		for(int i=0;i<no;i++) {
			arr[i]=s.nextInt();
		}
		cs.checkTemp(arr);

	}

	public void checkTemp(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				count++;
			}
		}
		System.out.println(count+" products need to be stored in the negative temperature");
		
	}

}

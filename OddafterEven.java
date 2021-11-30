package com.java_cat;

import java.util.Scanner;

public class OddafterEven {

	public static void main(String[] args) {
		OddafterEven obj = new OddafterEven();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of inputs: ");
		int num = s.nextInt();
		System.out.println("Enter the inputs: ");
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=s.nextInt();
			
		}
		obj.OrderEvenOdd(arr,num);
	}

	public void OrderEvenOdd(int[] arr, int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);				
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}		
		}				
	}
}

//program to add the largest two numbers

package com.java_cat;

import java.util.Scanner;

public class MaximumNumberAddition {

	public static void main(String[] args) {
		MaximumNumberAddition max = new MaximumNumberAddition();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of input: ");
		int num = s.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<num;i++) {
			arr[i]=s.nextInt();
			//System.out.println(arr[i]);
		}
		max.checkBigNumber(arr,num);

	}

	public  void checkBigNumber(int[] arr, int num) {
		int temp=0;
		for(int i=0;i<num;i++) {
			for(int j=i+1;j<num;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
			
		}
		System.out.println(arr[num-1]+arr[num-2]);
	}

}

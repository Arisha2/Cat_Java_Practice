
//program to find the number of occurrence of a particular number

package com.java_cat;

import java.util.Scanner;

public class NumberOfOccurence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		NumberOfOccurence noc = new NumberOfOccurence();
		System.out.println("Enter the data to be given as input: ");
		int data = s.nextInt();
		System.out.println("Enter the digit to be checked: ");
		int digit = s.nextInt();
		int result = noc.occurenceOfNumber(data,digit);
		System.out.println(result);
	}

	public int occurenceOfNumber(int data, int digit) {
		int answer=0;
		int num=0;
		while(data>0) {
			num = data%10; 			//Here, if the data is divided by 10, you will get the remainder as the last number.
			if(num==digit) {
				answer = answer+1;	
				
			}
			data=data/10;
			
		}
		return answer;
	}

}

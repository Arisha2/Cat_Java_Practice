package com.java_cat;

import java.util.Scanner;

public class DiscountOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DiscountOfNumber don = new DiscountOfNumber();
		System.out.println("Enter your bill amount: ");
		long bamount = s.nextInt();
		long result = don.discountCalculate(bamount);
		System.out.println(result);
	}

	public long discountCalculate(long bamount) {
		long count=0;
		while(bamount>0) {
			long num = bamount%10;
			if(num%2!=0) {
				count=count+num;
			}
			else {
				count=count;
			}
			bamount=bamount/10;
		}
		return count;
	}

}

package com.java_cat;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		BinaryToDecimal b =new BinaryToDecimal();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the binary number: ");
		int num = s.nextInt();
		double result= b.convertToDecimal(num);
		System.out.println(result);

	}

	public double convertToDecimal(int num) {
		int no=0; double decimal=0; int n=0;
		while(num>0) {
			int temp=num%10;
			decimal += (int) temp*Math.pow(2, n);
			num =num/10;
			n++;
		}
		
		return decimal;
	}

}

package com.java_cat;

import java.util.Scanner;

public class IntegerToBinary {

	public static void main(String[] args) {
		IntegerToBinary intbin = new IntegerToBinary();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to change into binary: ");
		int num = s.nextInt();
		String no = Integer.toBinaryString(num);
		String result = intbin.convertBinary(num);
		System.out.println(result);

	}

	public String convertBinary(int num) {
		String no = Integer.toBinaryString(num);
		String rev="";
		for(int i=no.length()-1; i>=0;--i) {
			rev += no.charAt(i);
		}
		return rev;
	}

}

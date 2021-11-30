package com.java_cat;

import java.util.Scanner;

public class NumberOfConsonants {

	public static void main(String[] args) {
		NumberOfConsonants noc = new NumberOfConsonants();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string to check for consonants: ");
		String str = s.next();
		noc.checkConsonants(str);

	}

	public void checkConsonants(String str) {
		int count=0;
		String arr[]=new String[str.length()];
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}

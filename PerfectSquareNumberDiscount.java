package com.java_cat;

import java.util.Scanner;

public class PerfectSquareNumberDiscount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int noc=0;
		System.out.println("Enter the number of customers to check for discounts: ");
		noc = s.nextInt();
		int bamount[]= new int[noc];
		PerfectSquareNumberDiscount psnd = new PerfectSquareNumberDiscount();
		
		System.out.println("Enter the bill amounts:  ");
		for(int i=0; i<noc; i++) {
			 bamount[i]=s.nextInt();
		}
		
		int result= psnd.checkDiscounts(noc,bamount);
		System.out.println(result);
	}

	public int checkDiscounts(int noc, int[] bamount) {
		int count=0;
		for(int i=0; i<bamount.length;i++) {
			float num = (float) Math.sqrt(bamount[i]);
			float check_num =  (num*10);
			if((check_num%10)==0) {
				count++;
			}
			
		}
		return count;
		
		
	}

}

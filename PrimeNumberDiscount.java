//program to find the discount of a number by adding the odd numbers

package com.java_cat;

import java.util.Scanner;

public class PrimeNumberDiscount {

	public static void main(String[] args) {
		PrimeNumberDiscount pnd = new PrimeNumberDiscount();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the bill amount: ");
		int	bamount = s.nextInt();
		
		int result = pnd.checkprimeDiscount(bamount);
		System.out.println("The discount for your bill amount is: "+result+"%");
	}

	public int checkprimeDiscount( int bamount) {
		int answer=0; 
		int res=0;
		int flag=0;
		while (bamount>0) {
			res=bamount%10;	
			if(res==2)
				flag=0;
			else 
				flag=1;
			for(int j=2; j<res;j++) {
				
				if(res%j==0) {
					
					flag=1;
					break;
				}
				else
				{
					flag=0;
					
				}
								
			}
			if(flag==0) {
				answer= answer+res;
			}
			bamount=bamount/10;
	}
		
		return answer;

}
}

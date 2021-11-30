package com.java_cat;

import java.util.Scanner;

public class UniqueRepeatingNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		UniqueRepeatingNumber urn = new UniqueRepeatingNumber();
		System.out.println("Enter the length of the input: ");
		int len = s.nextInt();
		System.out.println("Enter the number to check for uniquely repeating numbers: ");
		int num = s.nextInt();
		//System.out.println(num);
		urn.checkUniqueRepeating(num,len);
	}

	public void checkUniqueRepeating(int num,int len) {
		int count[]=new int[len];
		int result=0;
		while(num>0) {
			int remainder = num% 10; 	
			count[remainder]++;
			num = num/10;
		}
			for(int i=0;i<len;i++) {
			
			if(count[i]>1) {
				
				result++;
			}
			}
		
	    System.out.println(result);
	}
		
}

/*import java.util.Scanner;



public class Demo {
public static void securitykey(int data)
{
int res= 0;
int count[] = new int[10];
while (data > 0) {
int rem = data % 10;
count[rem]++;
data = data /10;
}

for (int i = 0; i<10; i++)
{
if(count[i] > 1) {//== if you want to count unique valus
res++;
}
}
System.out.println(res);
}
public static void main(String[] args)
{
Demo de = new Demo();
Scanner in = new Scanner(System.in);
System.out.println("Enter number : ");
int data=in.nextInt();
de.securitykey(data);
}



}
 */

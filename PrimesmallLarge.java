package com.java_cat;
import java.util.Scanner;

public class PrimesmallLarge {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter 1st number of range:");
int f = sc.nextInt();
System.out.print("Enter last number of range:");
int l = sc.nextInt();
PrimesmallLarge ap=new PrimesmallLarge();
ap.sum(f,l);
}

public void sum(int f, int l) {
// TODO Auto-generated method stub
int sum=0;int sum1=0;
for(int j=f;j<=l;j++)
{
boolean isPrime=check(j);
if(isPrime)
{
sum=j;
break;
}

}
for(int j=l;j>2;j--) {
boolean isPrime=checkReverse(j);
if(isPrime) {
	sum1 = j;
	break;
}
}
System.out.println("The sum is:"+sum);
System.out.println("The sum is:"+sum1);
System.out.println(sum+sum1);

}



public boolean checkReverse(int j) {
	for(int i=j/2;i>=2;i--) {
		if(j%i==0 && j!=1) {
			return false;
		}
	}
	return true;
}

public boolean check(int n) {

if(n==1)
{
return false;
}
for(int i=2;i*i<=n;i++)
{
if(n%i==0)
{
return false;
}
}
return true;

}

}
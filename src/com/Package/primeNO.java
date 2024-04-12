package com.Package;

import java.util.*;



public class primeNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to check the number is prime or not");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean isPrime =num > 1;
		
		for(int i=2; i<=Math.sqrt(num) && isPrime;i++)
		{
			if(num % i == 0) {
				isPrime= false;
			}
		}
		System.out.println(num+(isPrime ? " is a prime number." : " is not a prime number" ));
		
	}

}

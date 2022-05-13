package com.bridgelabz.corejavaprograms;
/*
 * @author : Ashwini
 * Java Program to Compute Quotient and Remainder
 */
import java.util.Scanner;

public class QuaotientOrRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        //Variable Declaration
	        int dividend,divisor,quotient,remainder;

	        //Scanner Class To Take Input from User
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the Value of Dividend :");
	        dividend = sc.nextInt();

	        System.out.println("Enter the Value of Divisor :");
	        divisor = sc.nextInt();

	        //Formula to get Quotient Or Remainder
	        quotient = dividend / divisor;
	        remainder = dividend % divisor;

	        //Displaying the value of Quotient Or Remainder
	        System.out.println("Quotient ="+quotient);
	        System.out.println("Remainder ="+remainder);
	}

}

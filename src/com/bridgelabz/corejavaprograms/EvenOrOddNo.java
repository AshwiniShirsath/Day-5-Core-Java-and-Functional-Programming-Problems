package com.bridgelabz.corejavaprograms;
/*
 * @author : Ashwini
 * Java Program to Check Whether a Number is Even or Odd
 */
import java.util.Scanner;

public class EvenOrOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Variable Declaration
        int number;

        //Scanner Object for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number :");
        number = sc.nextInt();

        //Checking for Even or Odd Number using Mod Operator
        if(number % 2 == 0) {
            System.out.println("The Number "+number+" is Even.");
        } else {
            System.out.println("The Number "+number+" is Odd.");
        }

	}

}

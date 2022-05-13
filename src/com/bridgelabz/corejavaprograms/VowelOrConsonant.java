package com.bridgelabz.corejavaprograms;
/*
 * @author : Ashwini
 * Java Program to Check Whether an Alphabet is Vowel or Consonant
 */
import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable Declaration
        char ch;

        //Scanner Object for User Input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Character :");
        ch = sc.next().toLowerCase().charAt(0);   //Taking Input and Convert it to Lowercase after that get First Char in variable

        //Checking for Character is Vowel or Consonant
        if( ch == 'a' || ch == 'e' || ch == 'i' || ch ==  'o' || ch == 'u') {
            System.out.println(ch + " is Vowel");
        } else {
            System.out.println(ch + " is Consonant");
        }
	}

}

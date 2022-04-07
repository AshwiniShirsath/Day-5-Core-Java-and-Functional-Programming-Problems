package com.bridgelabz.corejavaprograms;
/*
 * @author : Ashwini
 * a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
 * b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
 * c. O/P -> Percentage of Head vs Tails
 */
public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        System.out.println("Welcome to Program for Counting the Percentile of Head and Tail");

	        //Variables declaration
	        int headCount = 0;
	        int tailCount = 0;

	        for(int i=1; i<=10; i++) {

	            //Generating Random Flip of Coin
	            double coinFlip =  (Math.random()*10) % 1;

	            System.out.println("Coin Flip Value ="+coinFlip);

	            //Counting the Head and Tail Occurance
	            if(coinFlip < 0.5) {
	                tailCount++;
	            } else {
	                headCount++;
	            }
	        }

	        //Print Head & Tail Counts
	        System.out.println("TailCount:"+tailCount);
	        System.out.println("HeadCount:"+headCount);

	        //Calculating Percentage of Head vs Tail
	        int PercentTail = (tailCount * 100) / 10;
	        int PercentHead = (headCount * 100) / 10;

	        //Printing Percentage of Head vs Tail
	        System.out.println("The Percentage of Tails is : " + PercentTail);
	        System.out.println("The Percentage of Heads is : " + PercentHead);
	}

}

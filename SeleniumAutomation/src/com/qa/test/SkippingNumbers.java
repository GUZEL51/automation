package com.qa.test;

public class SkippingNumbers {

		//create a function using while loop to print numbers from 65 to 80 
		//76 will be skipped 
		

	public static void main(String[] args) {
		
		int start =65;
		
		while (start <= 80) {
			if (start >= 74 && start <= 76) {
				start ++;
				break;
			
			}
			//System.out.println(start);
			//start++;
			
			//or u can bring start in the begining both cases are correct
			//instead of break u can use continue also for another function 
			
			
			start++;
			System.out.println(start);
			
			
			}
		}
		
}
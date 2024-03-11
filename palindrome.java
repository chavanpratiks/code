package Seleniumpuneclass;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		  
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();
		        
		        if (isPalindrome(input)) {
		            System.out.println("The string is a palindrome.");
		        } else {
		            System.out.println("The string is not a palindrome.");
		        }
		        
		        scanner.close();
		    }

		    private static boolean isPalindrome(String str) {
		        return str.equals(new StringBuilder(str).reverse().toString());
		    }
		


	}



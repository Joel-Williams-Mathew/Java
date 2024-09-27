/* @Author : Joel Williams 
   @Date : 
   @Aim : Write a Program to find the number of occurrences of a character in a string.
*/
import java.io.*;
import java.util.Scanner;

class Count {

	public static void main(String[] args) {
	        // Define the class object 
		count cls = new count();
		cls.searchandcount();
	}
}
class count {

	public void searchandcount() {
		// Define the scanner object 
		Scanner obj = new Scanner(System.in);
		String str;
		String search;

		// Enter the string.
		System.out.println("Enter the string: ");
		str = obj.next();

		// Enter the search char
		System.out.println("Enter the search char: ");
		search = obj.next();
		
		int count = 0;
		int len = str.length();
		
		// Checking whether the char is present if yes then increment the count
		for (int i = 0;i<=len-1;i++) {
			if(str.charAt(i) == search.charAt(0)) {
				count+=1;
			}
		
		}
		System.out.println("Count :" + count);
	
	System.out.println("/nProgram Sucessfully executed Without Errors"); 
	}
}

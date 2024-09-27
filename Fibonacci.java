/* @Author : Joel Williams
   @Date : 
   @Aim : Write a program to find whether a number is in fibonacci series or not
*/

import java.util.Scanner;
import java.io.*;

class Fibonacci {
	public static void main(String args[]) {
		int n;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		n=ob.nextInt();
		fibonacci cls = new fibonacci();
		cls.function(n);
	
	}
}

class fibonacci {
	public void function(int n) {
		int i;
        	int n1=0;
        	int n2=1;
        	int no=n1+n2;
        	Scanner obj = new Scanner(System.in);
        	System.out.println("the fibonacci series is  ");
        	System.out.print(n1+" "+n2);
		// Loop for checking fibonacci series or not
        	for(i=3;i<=n;i++){
            		System.out.print(" "+no);
            		n1=n2;
            		n2=no;
            		no=n1+n2;
	
		}

	}
}





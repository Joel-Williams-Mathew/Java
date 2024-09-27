/* @Author : Joel Williams
   @Date : 
   @Aim : Write a program to find whether a string is palindrome or not
*/

import java.io.*;
import java.util.Scanner;
class palindrome{

	public static void main(String[] args) {
	//Declaration of class object
	Palindrome cls = new Palindrome();
	cls.palind();
	
	}


}

class Palindrome {

	public void palind() {
	
	Scanner obj = new Scanner(System.in);
	String str;
	int flag = 0;
	
	System.out.println("Enter the string :");
	str = obj.nextLine();
	
	int len = str.length();
	//checking whether a string is palindrome or not inside the loop
	for(int i = 0;i<=len/2;i++) {
		if(str.charAt(i)!=str.charAt(len-1-i)){
			flag = 1;
		}
	}
	if(flag == 1){
		System.out.println("Its NOT A PALINDROME!! ");
	}
	else {
		System.out.println("Its PALINDROME!! ");
	}
	}
}

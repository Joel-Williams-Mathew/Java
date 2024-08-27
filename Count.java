import java.io.*;
import java.util.Scanner;

class Count {

	public static void main(String[] args) {
	
		count cls = new count();
		cls.searchandcount();
	}
}
class count {

	public void searchandcount() {
		
		Scanner obj = new Scanner(System.in);
		String str;
		String search;
		
		System.out.println("Enter the string: ");
		str = obj.next();
		
		System.out.println("Enter the search char: ");
		search = obj.next();
		
		int count = 0;
		int len = str.length();
		
		
		for (int i = 0;i<=len-1;i++) {
			if(str.charAt(i) == search.charAt(0)) {
				count+=1;
			}
		
		}
		System.out.println("Count :" + count);
	
	System.out.println("/nProgram Sucessfully executed Without Errors"); 
	}
}

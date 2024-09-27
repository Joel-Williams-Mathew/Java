/* @Author : Joel Williams 
   @Date : 
   @Aim : Write a Program to implement a simple calculator using java
*/
import java.util.Scanner;
class calculator {
    public static void main(String[] args) {
        Joel cls = new Joel();
        String d;
        int a;
        int b;
        char c;
        Scanner de = new Scanner(System.in);
        System.out.println("Enter the operator :");
        d = de.next();
        c = d.charAt(0);
        System.out.println("Enter the first number :");
        a = de.nextInt();
        System.out.println("Enter the second number :");
        b = de.nextInt();

	// implementation of switch cases for different operations 
        switch(c) {
            case '+': {
                cls.add(a,b);
                break;
            }
            case '-': {
                cls.diff(a,b);
                break;
            }
            case '*': {
                cls.pdt(a,b);
                break;
            }
            case '/': {
                cls.div(a,b);
                break;
            }
            case '%': {
                cls.rem(a,b);
                break;
            }
            default: {
                System.out.println("INVALID OPERATOR !!");
                break;
            }
        }
    }
}

class Joel {
	Scanner op = new Scanner(System.in);

	// Addition method
	public void add(int a, int b) {
		System.out.println("WELCOME TO ADDITION !");
	    	int sum;
        	sum = a+b;
	    	System.out.println("Sum :"+ sum);
	}

	// Subtraction method 
	public void diff(int a, int b) {
	    System.out.println("WELCOME TO SUBTRACTION !");
	    int sub;
	    sub = a-b;
	    System.out.println("Difference :"+ sub);
	}
	// Multiplication method
   public void pdt(int a, int b) {
	    System.out.println("WELCOME TO MULTIPLICATION !");
	    int pdt;
	    pdt = a*b;
	    System.out.println("Product :"+ pdt);
	}
	// Division method
    public void div(int a, int b) {
	    System.out.println("WELCOME TO DIVISION !");
	    int div;
	    div = a/b;
	    System.out.println("Division :"+ div);
	}
	// Remainder method
	public void rem(int a, int b) {
	    System.out.println("WELCOME TO MODULOUS !");
	    int rem;
	    rem = a%b;
	    System.out.println("Remainder :"+ rem);
	}
}






import java.util.Scanner;
class methodoverloading {
	public static void main(String[] args) {
        	MethodOverload ovrload = new MethodOverload();

        	// Calling the add method with two integers
        	System.out.println("Sum of 2 and 3: " + ovrload.add(2, 3));

        	// Calling the add method with three integers
        	System.out.println("Sum of 1, 2, and 3: " + ovrload.add(1, 2, 3));

        	// Calling the add method with two double values
        	System.out.println("Sum of 2.5 and 3.5: " + ovrload.add(2.5, 3.5));

        	// Calling the add method with two strings
        	System.out.println("Concatenation of 'Hello' and ' World': " + ovrload.add("Hello", " World"));
        }
}

class MethodOverload {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add two strings (concatenation)
    public String add(String a, String b) {
        return a + b;
    }
}


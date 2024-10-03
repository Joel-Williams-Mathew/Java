
/* 
	Author : Joel Williams
	Date : 26/9/24
	Aim : To implement Polymorphism using java
*/


// Abstract class Shape
abstract class Shape {
	//Abstract method numberOfSides
	public abstract void numberOfSides();
}

//Class rectangle extending Shape
class Rectangle extends Shape {
	//implementation of abstract method
	@Override
	public void numberOfSides() {
		System.out.println("A Rectangle has 4 sides.");
       }
}

class Triangle extends Shape {
	@Override
	public void numberOfSides() {
		System.out.println("A Triangle has 3 Sides.");
	}
}

class Hexagon extends Shape {
	@Override
	public void numberOfSides() {
		System.out.println("A Hexagon has 6 sides.");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Shape rectangle = new Rectangle();
		Shape triangle = new Triangle();
		Shape hexagon = new Hexagon();
		
		rectangle.numberOfSides();
		triangle.numberOfSides();
		hexagon.numberOfSides();		
	}
}

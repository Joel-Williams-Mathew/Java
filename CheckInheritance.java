class Animal {
	public String name;
	public void eat() {
		System.out.println("Eat function in class Animal");
	}
}
class Dog extends Animal {
	public void eat() {
		super.eat();
		System.out.println("Eat function in class Dog");
	}
	public void display() {
		System.out.println("New name is "+name);
	}
}

class CheckInheritance {
	public static void main(String[] args) {
		Dog lab = new Dog();
		lab.name = "Tiger";
		lab.display();
		lab.eat();
	}
}

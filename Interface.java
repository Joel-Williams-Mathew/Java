
/* 
	Author : Joel Williams
	Date : 26/9/24
	Aim : To implement interface using java
*/
class Animal {
    int legs;
    Animal(int legs) {
        this.legs = legs;
    }
    void walk() {
        System.out.println("\nThis Animal walks on " + legs + " legs");
    }
    void eats() {
        System.out.println("\nThis Animal eats ");
    }
}
interface Pet {
    String getName();
    void setName(String name);
    void play();
}
class Spider extends Animal {
    Spider(int legs) {
        super(legs);
    }
    void eats() {
        System.out.println("\nSpider eats insects.");
    }
}
class Cat extends Animal implements Pet {
    String name;  
    Cat(String name, int legs) {
        super(legs);
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void play() {
        System.out.println("\nCat loves to play with a ball");
    }
    public void eats() {
        System.out.println("\nCat eats fish");
    }
}
class Fish extends Animal implements Pet {
    String name;
    Fish(String name, int legs) {
        super(legs);
        this.name = name;    
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void eats() {
        System.out.println("\nFish eats plants");
    }
    public void play() {
        System.out.println("\nFish likes to play with shells");
    }
    public void walk() {
        System.out.println("\nFish has no legs");
    }
}
public class Interface {
    public static void main(String[] args) {
        Animal a = new Animal(4);
        System.out.println("\n\nFish");
        Fish f = new Fish("Netholi", 0);
        System.out.println("\nThis Fish's name is " + f.getName());
        f.eats();
        f.walk();
        f.setName("Memi");
        System.out.println("\nThis Fish's name is " + f.getName());
        
        System.out.println("\n\nCat");
        Cat c = new Cat("Tom", 4); // Changed from Fish to Cat
        System.out.println("\nThis Cat's name is " + c.getName());
        c.eats();
        c.play();
        c.setName("Kadann Poocha"); // Correctly set the Cat's name
        System.out.println("\nThis Cat's name is " + c.getName());
        
        System.out.println("\n\nSpider");
        Spider s = new Spider(8);
        s.eats(); // Changed from eat to eats
        s.walk();
    }
}



































import java.util.Scanner;
class Inheritance{  
	public static void main(String[] args) {
       		Programmer p=new Programmer(); 
		int a;
       		Scanner obj = new Scanner(System.in);
       		System.out.println("Enter the years of experience :");
       		a = obj.nextInt();
       		if(a>=10) {
       			System.out.println("Salary of the programmer is :"+p.salary);
       			System.out.println("Bonus of Programmer is:"+p.extrabonus);
       		}
       		else {
       			System.out.println("Salary of the programmer is :"+p.salary);
       			System.out.println("Bonus of Programmer is:"+p.bonus);
       		}
    	} 
    }  
class Programmer extends Inheritance{  
	float salary=40000;  
	int bonus=5000;
	int extrabonus=20000;
	
     	 
    }   

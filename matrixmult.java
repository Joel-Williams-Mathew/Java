import java.util.Scanner;
import java.io.*;
 
class matrixmult {
	public static void main(String[] args) {
		matrix cls = new matrix();
		cls.mult();
	}
}

class matrix {
	public void mult() {

		int i,j,k,r1,r2,c1,c2;
		Scanner obj = new Scanner(System.in);
	
		System.out.println("Enter the no of rows in first matrix :");
		r1 = obj.nextInt();
		System.out.println("Enter the no of columns in first matrix :");
		c1 = obj.nextInt();
		
		System.out.println("Enter the no of rows in second matrix :");
		r2 = obj.nextInt();
		System.out.println("Enter the no of columns in second matrix :");
		c2 = obj.nextInt();
		
		if(r1!=c2) {
			System.out.println("Matrix Multiplication not possible !!");
			return;
		}
		int a[][] = new int [r1][c1];
		int b[][] = new int [r2][c2];
		int c[][] = new int [r1][c2];
	
		for(i=0;i<r1;i++) {
	
			for(j=0;j<c1;j++) {
				
				System.out.println("Enter the elements of the first matrix :");
				a[i][j] = obj.nextInt();
			}
	
		}
		for(i=0;i<r2;i++) {
	
			for(j=0;j<c2;j++) {
				
				System.out.println("Enter the elements of the second matrix :");
				b[i][j] = obj.nextInt();
			}
	
		}
		for(i=0;i<r1;i++) {
	
			for(j=0;j<c2;j++) {
				
				c[i][j] = 0;
				for(k=0;k<c1;k++) {
				
				c[i][j] += a[i][k]*b[k][j];
				}
				
			}
				
		}
		for(i=0;i<r1;i++) {
			System.out.println();
			for(j=0;j<c2;j++) {
			
			System.out.print(c[i][j]+" ");
			}
		}
	}
}
	
	
	





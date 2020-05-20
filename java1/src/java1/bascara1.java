package java1;

import java.util.Scanner;

public class bascara1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x1;
		double x2;
		double b;
		double a;
		double c;
		double delta;
		
		b = sc.nextDouble();
		a = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = (Math.pow(b, 2.0) - 4.0*a*c); 
		x1 = (-b + (Math.sqrt(delta))) / (2.0*a); 
		x2 = (-b - (Math.sqrt(delta))) / (2.0*a);
		
		System.out.println("O valor de delta é: " + delta);
		System.out.println("O valor de x1 é: " + x1);
		System.out.println("O valor de x2 é: " + x2);
	}

}

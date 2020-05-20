package java1;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double Pi = 3.14159;
		double x; 
		double area; 
		
		x = sc.nextDouble();
		area = Pi*(Math.pow(x, 2.0));
		
		System.out.printf("O valor da área é: %.4f%n", area);
	}
}

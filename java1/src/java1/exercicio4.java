package java1;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		int horasTrabalhadas; 
		double salarioHora;
		double salarioTotal;
		
		number = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		salarioHora = sc.nextDouble();
		
		salarioTotal = horasTrabalhadas*salarioHora;
		
		System.out.println("NUMBER: " + number);
		System.out.printf("SALARY = U$ %.2f%n", salarioTotal);

	}

}

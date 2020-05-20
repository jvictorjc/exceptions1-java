package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Studant;

public class Program5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Studant studant = new Studant();
		double media = 60.00;
		
		System.out.println("Nome: ");
		studant.nome = sc.nextLine();
		
		System.out.println("N1: ");
		studant.n1 = sc.nextDouble();
		
		System.out.println("N2: ");
		studant.n2 = sc.nextDouble();
		
		System.out.println("N3: ");
		studant.n3 = sc.nextDouble();
		
		System.out.println(studant);
		
		if(studant.mediaPonderada() < media){
			double diferenca = media - studant.mediaPonderada();
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", diferenca);
		}else{
			System.out.println("PASS");
		}
	}

}

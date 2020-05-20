package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class exemploBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Client client;
		
		System.out.println("Enter account number: ");
		int conta = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n): ");
		char resultado = sc.next().charAt(0);
		if(resultado == 'y'){
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			client = new Client(conta, name, initialDeposit);
		}else {
			client = new Client(conta, name);
		}
		client.pulaLinha();
		System.out.println("Account data: ");
		System.out.println(client);
		
		client.pulaLinha();
		System.out.println("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		client.deposito(deposito);
		System.out.println("Updated deposito: ");
		System.out.println(client);
		
		client.pulaLinha();
		System.out.println("Enter a account value: ");
		double retirada = sc.nextDouble();
		client.retirada(retirada);
		System.out.println("Updated retirada: ");
		System.out.println(client);
		sc.close();
		
	}

}

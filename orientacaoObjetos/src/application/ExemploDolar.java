package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class ExemploDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double dollarPrice = 0.00;
		
		System.out.println("What is the dollar price? ");
		dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double quantityDollars = sc.nextDouble();
		double result = CurrencyConverter.Converter(dollarPrice, quantityDollars);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		sc.close();

	}

}

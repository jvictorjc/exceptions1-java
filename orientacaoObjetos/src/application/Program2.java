package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Entender product data: ");
		System.out.printf("Name: ");
		product.name = sc.next();
		System.out.printf("Price: ");
		product.price = sc.nextDouble();
		System.out.printf("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		product.pulaLinha();
		System.out.println("Product data: " + product);
		
		product.pulaLinha();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.AddProducts(quantity);
		
		product.pulaLinha();
		System.out.println("Updated data: " + product);
		
		product.pulaLinha();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);
		
		product.pulaLinha();
		System.out.println("Updated data: " + product);
	}
}

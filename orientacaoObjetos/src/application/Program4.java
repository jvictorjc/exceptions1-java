package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		
		System.out.println("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();
		
		emp.pulaLinha();
		System.out.println("Employee: " + emp);
		
		emp.pulaLinha();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		emp.pulaLinha();
		System.out.println("Updated data: "+ emp);
		

	}

}

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ExemploList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			System.out.println();
			System.out.println("Emplyocee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)){	
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salario = sc.nextDouble();
			list.add(new Funcionario(id, name, salario));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase :");
		int id = sc.nextInt();
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(func == null){
			System.out.println();
			System.out.println("This id does not exist! ");
		}else{
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			func.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Funcionario obj : list){
			System.out.println(obj);
		}
	}

	private static boolean hasId(List<Funcionario> list, Integer id) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}

}

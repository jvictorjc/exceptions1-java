package condicionantes;

import java.util.Scanner;

public class cond5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Qual o código do produto? ");
		 int codigo = sc.nextInt();
		 System.out.println("Qual a quandidade do produto? ");
		 int quantidade = sc.nextInt();
		 double preco = 0;
		 
		 if(codigo == 1){
			 preco = 4.00 * quantidade;
		 }
		 else if(codigo == 2){
			 preco = 4.50 * quantidade;
		 }
		 else if(codigo == 3){
			 preco = 5.00 * quantidade;
		 }
		 else if(codigo == 4){
			 preco = 2.00 * quantidade;
		 }
		 else if(codigo == 5){
			 preco = 1.50 * quantidade;
		 }
		 System.out.printf("Total do pedido: R$%.2f%n", preco);
	}

}

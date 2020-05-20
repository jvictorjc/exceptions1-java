package condicionantes;

import java.util.Scanner;

public class cond1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int n1;
		 System.out.println("Qual o numero? ");
		 n1 = sc.nextInt();
		 if(n1<0){
			 System.out.println("O numero " + n1 + " é negativo");
		 }
		 else if(n1 == 0){
			 System.out.println("O numero 0 não é um número válido");
		 }
		 else System.out.println("O numero " + n1 + " é positivo");
	}

}

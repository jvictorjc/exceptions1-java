package condicionantes;

import java.util.Scanner;

public class cond3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 int n1;
		 int n2;
		 System.out.println("Qual o primeiro numero? ");
		 n1 = sc.nextInt();
		 System.out.println("Qual o segundo numero? ");
		 n2 = sc.nextInt();
		 
		 if(n1%n2 == 0 || n2%n1 == 0){
			 System.out.println("São multiplos ");
		 }
		 else{
			 System.out.println("Não são multiplos ");
		 }
	}

}

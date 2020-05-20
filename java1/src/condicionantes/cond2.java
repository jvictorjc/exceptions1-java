package condicionantes;

import java.util.Scanner;

public class cond2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int n1;
		 System.out.println("Qual o numero? ");
		 n1 = sc.nextInt();
		 
		 if(n1%2 == 0){
			 System.out.println("O numero " + n1 + " é par");
		 }
		 else {
			 System.out.println("O numero " + n1 + " é impar");
		 }
	}

}

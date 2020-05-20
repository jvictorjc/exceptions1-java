package condicionantes;

import java.util.Scanner;

public class cond4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Qual a primeira hora? ");
		 int horaInicial = sc.nextInt();
		 System.out.println("Qual a segunda hora? ");
		 int horaFinal = sc.nextInt();
		 
		 int duracao; 
		 if(horaInicial < horaFinal){
			 duracao = horaFinal - horaInicial;
		 }
		 else {
			 duracao = 24 - horaInicial + horaFinal;
		 }
		 
		 System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		 sc.close();
	}

}

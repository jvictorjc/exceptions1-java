package java1;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A;
		int B;
		int C;
		int D;
		int DIFERENCA;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		DIFERENCA = ((A*B)-(C*D));
		System.out.println("DIFERENÇA: " + DIFERENCA);
	}
}

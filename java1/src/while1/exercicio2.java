package while1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x > 0 && y > 0){
			System.out.println("primeiro quadrante");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		while(x > 0 && y < 0){
			System.out.println("quarto quadrante");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		while(x < 0 && y < 0){
			System.out.println("terceiro quadrante");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		while(x < 0 && y > 0){
			System.out.println("segundo quadrante");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		while(x == 0 || y == 0){
			System.out.println("");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}
	
	public static void main1 (String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}

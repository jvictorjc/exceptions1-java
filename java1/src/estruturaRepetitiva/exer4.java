package estruturaRepetitiva;

import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 3;

		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			if (y == 0) {
				System.out.println("Divisão impossivel");
			} else {
				System.out.println(x / y);
			}
		}
	}
}

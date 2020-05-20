package java1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float a;
		float b;
		float c; 
		float areaTriang;
		float areaCirculo;
		float areaTrapez;
		float areaQuadrad;
		float areaRetan;
		double pi = 3.14159;
		
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		areaTriang = a*c/2.0f;
		areaCirculo = (float) (pi*(Math.pow(c, 2.0f)));
		areaTrapez = ((a+b)*c)/2.0f;
		areaQuadrad = (float) Math.pow(b, 2.0f);
		areaRetan = a*b;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriang );
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapez);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrad);
		System.out.printf("RETANFULO: %.3f%n", areaRetan);
		
	}

}

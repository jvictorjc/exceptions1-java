package application;

import java.util.Locale;
import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for(int i=0; i<mat.length; i++){ 
			for(int j=0;j<mat[i].length;j++){
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println(mat);

	}

}
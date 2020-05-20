package entities;


public class Studant {
	
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public double mediaPonderada(){
		return n1 + n2 + n3;
	}
	
	public String toString(){
		return nome + " FINAL GRADE = " + String.format("%.2f", mediaPonderada());
	}
}

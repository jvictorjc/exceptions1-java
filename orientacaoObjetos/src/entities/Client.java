package entities;

public class Client {
	
	private int conta; 
	private String name;
	private double movimento;
	
	public Client(int conta, String name, double movimento) {
		super();
		this.conta = conta;
		this.name = name;
		this.movimento = movimento;
	}

	public Client(int conta, String name) {
		this.conta = conta;
		this.name = name;
	}
	
	public void movimentacao(String movimento, double deposito){
		
	}
	
	public void deposito(double movimentacao){
		movimento += movimentacao;
	}
	
	public void retirada(double movimentacao){
		movimento -= movimentacao + 5.00; 
	}
	
	public String toString(){
		return "Account " 
				+ conta 
				+ ", Holder: " 
				+ name
				+ ", Balance: "
				+ String.format("%.2f", movimento);
	}
	
	public void pulaLinha(){
		System.out.println();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getConta() {
		return conta;
	}

	public double getMovimento() {
		return movimento;
	}
	

}

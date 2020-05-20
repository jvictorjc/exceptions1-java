package entities;

public class Funcionario {
	private Integer id;
	private String name;
	private Double salario;
	
	public Funcionario() {
	}

	public Funcionario(Integer id, String name, Double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	
	public void increaseSalary(double percentage){
		salario += salario*percentage/100;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salario);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalario() {
		return salario;
	}

	public Integer getId() {
		return id;
	}
	
}

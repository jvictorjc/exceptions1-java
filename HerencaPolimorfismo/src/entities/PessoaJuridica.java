package entities;

public class PessoaJuridica extends Pessoa{
	
	private Integer numeroFuncionario;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionario) {
		super(nome, rendaAnual);
		this.numeroFuncionario = numeroFuncionario;
	}

	public Integer getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(Integer numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	@Override
	public Double taxa() {
		if(numeroFuncionario <= 10){
			return rendaAnual * 0.16;
		}
		else{
			return rendaAnual * 0.14;
		}
	}
	
}

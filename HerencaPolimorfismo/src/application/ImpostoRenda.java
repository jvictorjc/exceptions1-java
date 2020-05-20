package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class ImpostoRenda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		System.out.print("Entre com o numero de pessoas: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Taxa pessoa #" + i + " data:");
			System.out.print("Pessoa Fisica ou Juridica (f/j)? ");
			char tipoPessoa = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda Anual: ");
			sc.nextLine();
			double rendaAnual = sc.nextDouble();
			if (tipoPessoa == 'f') {
				System.out.print("Gasto com saude: ");
				double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
				
			} else {
				System.out.print("Quantos funcionarios: ");
				int numeroFuncionario = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionario));
			}

		}
		System.out.println();
		System.out.println("Taxas Pagas: ");
		double sum = 0.0;
		for (Pessoa pessoa : list) {
			double taxa = pessoa.taxa();
			pessoa.setRendaAnual(taxa);
			System.out.println(pessoa.taxasPagas());
			sum += taxa;
		}

		System.out.println("Total de Taxas: $ " + sum);

		sc.close();
	}

}

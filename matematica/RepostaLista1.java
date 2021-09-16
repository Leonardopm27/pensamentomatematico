package matematica;

import java.util.Scanner;

public class RepostaLista1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		float valorSalario = 0;
		float percentualAumento = 0;
		float valorAumento = 0;
		float novoSalario = 0;
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o valor do salario:");
		valorSalario = leitor.nextFloat();
		System.out.print("Informe o porcentual de aumento");
		percentualAumento = leitor.nextFloat();

		valorAumento = (valorSalario * percentualAumento) / 100;
		System.out.println("Valor Aumento" + valorAumento);
		novoSalario = valorSalario + valorAumento;
		System.out.println("Valor Salário: " + valorSalario);
		System.out.println("% de aumento: " + percentualAumento);
		System.out.println("Valor Aumento: " + valorAumento);
		System.out.println("Novo Salário: " + novoSalario);

	}

}

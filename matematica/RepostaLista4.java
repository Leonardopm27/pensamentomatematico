package matematica;

import java.util.Scanner;

public class RepostaLista4 {

	public static void main(String[] args) {
		float aumento = 0.20F;
		float salario;
		String funcionario = null;
		Scanner texto = new Scanner(System.in);

		while (true) {

			System.out.println("Informe o nome do colaborador: ");

			funcionario = texto.nextLine();

			if (funcionario.equalsIgnoreCase("fim")) {
				System.exit(0);
			}

			if (funcionario != "fim") {
				System.out.println("Informe o salário do colaborador: ");
				salario = Float.parseFloat(texto.nextLine());

				if (salario <= 500) {
					float reajusto = salario * aumento;
					float soma = reajusto + salario;

					System.out.println(soma);

				} else {
					System.out.println("Funcionário não tem direito à aumento");
				}

			}

		}

	}

}

package matematica;

import java.util.Scanner;

public class RespostaLista6 {
	public static void main(String[] args) {
		float percentualMax = 0.3f;
		float valorPrestacao = 0.0f;
		Scanner leitor = new Scanner(System.in);
		float valorSalario = 0.0f;

		System.out.println("Informe o valor do salário: ");
		valorSalario = leitor.nextFloat();

		System.out.println("Informe o valor da prestação: ");
		valorPrestacao = leitor.nextFloat();

		if (valorPrestacao <= (valorSalario * percentualMax)) {
			System.out.println("Empréstimo aceito: ");

		} else {
			System.out.println("Empréstimo negado: ");
		}

	}

}

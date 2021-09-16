package matematica;

import java.util.Scanner;

public class RepostaLista2 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int contador = 0;
		int valor = 0;

		while (contador < 10) {
			System.out.println("Informe o valor");
			valor = leitor.nextInt();
			if (valor % 2 == 0) {
				System.out.println("valor é par");
			} else {
				System.out.println("valor é impar");
			}

		}

	}

}

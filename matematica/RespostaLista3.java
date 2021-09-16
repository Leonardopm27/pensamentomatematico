package matematica;

import java.util.Scanner;

public class RespostaLista3 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o número: ");

		int opcaoTabuada = leitor.nextInt();

		for (int x = 1; x <= 10; x++) {
			int resultado = opcaoTabuada * x;
			System.out.println(resultado);

		}
	}
}

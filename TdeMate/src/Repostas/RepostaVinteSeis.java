package Repostas;

public class RepostaVinteSeis {
	public static void main(String[] args) {

		System.out.println("26.Fa�a um programa para imprimir os n�meros primos de 1 a 123. ");

		int contador = 0;

		for (int num = 1; num <= 123; num++) {
			contador = 0;

			for (int aux1 = 1; aux1 <= num; aux1++) {
				if (num % aux1 == 0) {
					contador++;

				}
			}
			if (contador == 2) {
				System.out.println("N�mero " + num + " � primo");
			}

		}

	}

}

package Repostas;

import java.util.Scanner;

public class RespostraTreze {

	public static void main(String[] args) {

		System.out.println("13.Declare tr�s vari�veis com tipos diferentes, sem atribuir valor. Depois atribua\r\n"
				+ "um valor qualquer a elas com dados digitados pelo usu�rio.\r\n" + "");

		Scanner texto = new Scanner(System.in);

		System.out.println("Escreva uma frase: ");
		String frase = texto.nextLine();
		System.out.println("A frase foi: " + frase);

		System.out.println("Escreva um n�mero inteiro : ");
		int numerointeiro = Integer.parseInt(texto.nextLine());
		System.out.println("O numero inteiro foi: " + numerointeiro);

		System.out.println("Escrava um n�mero quebrado: ");
		double numeroquebrado = Double.parseDouble(texto.nextLine());
		System.out.println("O n�mero foi: " + numeroquebrado);

	}
}

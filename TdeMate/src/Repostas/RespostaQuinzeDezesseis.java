package Repostas;

import java.util.Scanner;

public class RespostaQuinzeDezesseis {

	public static void main(String[] args) {
		System.out.println("15.Implemente um programa que receba dados digitados pelo usu�rio e atribua\r\n"
				+ "a uma vari�vel do tipo String e imprima a frase inserida no console.\r\n" + "");

		Scanner texto = new Scanner(System.in);
		String frase = texto.nextLine();
		System.out.println(frase);
		
		System.out.println("16.Concatene na vari�vel criada acima a frase � � Exemplo String�.\r\n"
				+ "");
		
		String frase2 =  frase + "-Exemplo String";
		System.out.println(frase2);
		
		System.out.println("17.Imprima na tela (console) o n�mero de caracteres da String.");
		
		
		

	}
	

}

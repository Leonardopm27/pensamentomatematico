package Repostas;

import java.util.Scanner;

import org.w3c.dom.Text;

public class RespostaVinte {
	public static void main(String[] args) {
		System.out.println("20.Crie uma vari�vel inteira com um valor qualquer e verifique se o valor desta\r\n"
				+ "vari�vel � menor que 15 ou maior que 100.");
		
		Scanner texto = new Scanner(System.in);
		int valorA = Integer.parseInt(texto.nextLine());;
		
		if (valorA < 15 || valorA >100) {
			System.out.println("Valor v�lido.");
		}else {
			System.err.println("Valor inv�lido");
		}
	
		System.out.println("21.Crie uma vari�vel com valor de ponto flutuante com um valor qualquer e\r\n"
				+ "verifique se o valor desta vari�vel est� entre 1.99 e 5.99.\r\n"
				+ "");
		
		double valorB = Double.parseDouble(texto.nextLine());
		System.out.println(valorB);
		
		if (valorB < 1.99 || valorB < 5.99) {
			System.out.println("Valor v�lido");
		}else {
			System.err.println("Valor inv�lido");
			
		}
		
		System.out.println("22. Agora compare se o valor das duas vari�veis acima � igual.");
		
		if (valorA == valorB) {
			System.out.println("Valores igual");
		}else {
			System.err.println("Valores diferentes");
		}
		
		System.out.println("23.Calcule o valor da multiplica��o de um int por um double, atribuindo o valor a\r\n"
				+ "um int.\r\n"
				+ "");
		
		double divisao = valorA / valorB;
		System.out.println(divisao);
		
		
		
	}

}

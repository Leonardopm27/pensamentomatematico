package Repostas;

import java.util.Scanner;

public class RepostaVinteSete {
	public static void main(String[] args) {
		
		System.out.println("27.Fa�a um programa para ler um n�mero do teclado e imprimir na tela se ele �\r\n"
				+ "par ou �mpar. Imprima tamb�m se ele � primo.");
		
		
		
		
		Scanner num = new Scanner(System.in);
		System.out.println("Digite seu n�mero: ");
		int valorA = num .nextInt();
		
		
		int contador = 0;
		
		if (valorA % 2 == 0) {
			System.out.println("O n�mero " + valorA + " � par");
		}else {
			System.out.println("O n�mero " +valorA + " � impar");
		}
		
	
		for ( int aux = 1; aux <=valorA; aux ++) {
			if (valorA%aux ==0) {
				contador++;
			}
			
		
		}

		if (contador == 2){
			System.out.println("O n�mero " + valorA + " � primo");
			}
	
	}

	}

package Repostas;

import java.util.Scanner;




public class RepostaTrintaDois {
	public static void main(String[] args) {
		System.out.println("32.Implemente um programa para calcular a �rea de um trap�zio, onde:\r\n"
				+ "h = altura\r\n"
				+ "b = base menor\r\n"
				+ "B = base maior\r\n"
				+ "�rea = (h . (b + B)) / 2");
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Escreva a altura: ");
		
		double h = numero.nextDouble();
		
		System.out.println("Escreva base menor");
		
		double b = numero.nextDouble();
		
		System.out.println("Escreva base maior");
		
		double B = numero.nextDouble();
		
		double area = (h * (b + B ) )/2.0;
		
		System.out.println("A �rea do trap�zio � de: " + area);
		
		
		

	}

}

package Repostas;

import java.util.Scanner;

public class RespostaVintenoveTrinta {
	public static void main(String[] args) {
		System.out.println("29.O valor pago por um Hotel da Praia de Iracema para seus porteiros � de R$\r\n"
				+ "10,25 por hora de trabalho. Fa�a um programa que pergunte ao usu�rio\r\n"
				+ "quantas horas ele trabalhou e imprima na tela o valor do sal�rio a ser recebido\r\n"
				+ "por ele.\r\n"
				+ "");
		
		double salaH = 10.25;
		
		
		Scanner texto = new Scanner(System.in);
		
		
		System.out.println("Informe quantas horas trabalhadas: ");
		double horas = texto.nextDouble();
		
		double salario = salaH * horas;
		System.out.println("Seu sal�rio foi de :" + salario);
		
		if (salario < 50.00) {
			System.out.println("Aten��o, dirija- se � dire��o do Hotel!");
		}
		
		
		
	}

}

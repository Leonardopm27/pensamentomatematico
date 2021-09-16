package matematica;

import java.util.Scanner;

public class RepostaLista5 {
	public static void main(String[] args) {
		float refrigerante = 3.0f;
		float precoGasolina = 2.5f;
		float litroGasolina = 0.0f;
		int quantidadeRefrigerante = 0;
		
		Scanner texto = new Scanner (System.in);
		System.out.println("Informe quantidade de gasolina: ");
		litroGasolina = texto.nextFloat();
		
		System.out.println("Informe quantidade de refrigerante: ");		
		quantidadeRefrigerante = texto.nextInt();
		
		
		float pagamento = (litroGasolina*precoGasolina) + (refrigerante*quantidadeRefrigerante);
		System.out.println(pagamento);
		
		
	}

}

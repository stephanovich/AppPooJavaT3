package testes;

import java.util.Scanner;

public class TestaVetores {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tamanho = Integer.valueOf(args[0]);
		int mes = 0;	
		float soma = 0;
		
		float[] valores = new float[tamanho];		
		float[] totais = new float[12];		
		String[] meses = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};		
		
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Digite o valor: ");
			valores[i] = ler.nextFloat();
			System.out.print("Informe o mês: ");
			mes = ler.nextInt();
			totais[mes - 1] = totais[mes - 1] + valores[i];
		}
		for (float valor : valores) {
			soma = soma + valor;
		}
		System.out.println("------- Total -------");
		for (int i = 0; i < totais.length; i++) {
			System.out.printf("%s....: R$%.2f\n",
					meses[i],
					totais[i]
					);			
		}			
		System.out.println("---------------------");
		System.out.println("Tamanho do vetor: " + valores.length);
		System.out.println("Valor total: " + soma);				
	}
}

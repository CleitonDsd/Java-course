package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe11VetA10IntDefinaEscrevaQuantidadeDePares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner (System.in);
		
		int [] vetorA = new int [3];
		int [] vetorB = new int [3];
		
		int soma = 0, quantidade = 0;
		System.out.println("Insira os valores do Vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(i + "° posição do vetor, valor: ");
			vetorA[i] = scan.nextInt();			
			
		}
		System.out.println(" ");
		for (int i = 0; i < vetorA.length; i++) {			
			if (vetorA[i] % 2 == 0) {
				quantidade += 1;
				System.out.println(i + "° posicão do vetor, " + vetorA[i] + " é Par");					
			}	
			soma += vetorA[i];
		}
		System.out.println("Total dos números pares: " + soma);
		System.out.println("Quantidade de pares: " + quantidade);
	}

}

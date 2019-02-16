package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe14VetA10IntImprimirMediaDosImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int [3];
		int soma = 0;
		
		System.out.println("Insira os Valores do Vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(i + "° posição, valor: ");
			vetorA[i] = scan.nextInt();		
		}
		System.out.println(" ");
		System.out.println("Média Aritmética dos impares: ");
		for(int i = 0; i < vetorA.length; i++) {
			if (vetorA.length % 2 == 1) {
				System.out.println(i + "° posição, " + vetorA[i] + " é impar" );
				soma += vetorA[i];
				
			}
			soma /= i;
		}
		System.out.println("Média dos Impares: " + soma);
	}

}

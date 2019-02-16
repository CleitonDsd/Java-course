package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe12VetorA10IntImprimaSomaDeTodosElementos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int [10];
		int soma = 0;
		
		System.out.println("Insira os Valores do Vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(i + "° posição, valor: ");
			vetorA[i] = scan.nextInt();
			soma += vetorA[i];
		}
		System.out.println(" ");
		System.out.println("Total dos números somados: " + soma);
	}

}

package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe13VetA10IntImprimirMultiplosDe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int [10];
		int soma = 0;
		
		System.out.println("Insira os Valores do Vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(i + "� posi��o, valor: ");
			vetorA[i] = scan.nextInt();		
		}
		System.out.println(" ");
		System.out.println("Multiplos de 5");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 5 == 0) {
			System.out.println(i + "� posi��o, " + vetorA[i] + " � multiplo ");
			}else{
				System.out.println(i + "� posi��o, " + vetorA[i] + "n�o � multiplo ");	
			}
		}
	}

}

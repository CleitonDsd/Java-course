package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe05VetorACom10IntVetBIgualMasMultpPorSuaPosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int [] vetorA = new int [10];
		int [] vetorB = new int [vetorA.length];
		
		for (int i = 0; i < vetorA.length; i ++) {
			System.out.print(i + "° valor: ");
			vetorA[i] = scan.nextInt();
			
			
			vetorB[i] = vetorA[i];
			vetorB[i] = vetorA[i] * i;
			
		}
		System.out.println("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(i + "° posição = " + vetorA[i]);			
		}
		System.out.println("");
		System.out.println("Vetor B = Vetor A * por sua posição I ");
		for (int i = 0; i < vetorB.length; i++) {			
			System.out.println(i + "° posição = " + vetorB[i]);			
		}
	}

}

package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe25VetorAVetorBValoresAlternados {
	
	/*
	 * Enquanto o vetorA for impar o vetorB deve ser ==0;{ else
	 * 							   o vetorB deve ser ==1.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int [] vetorA = new int [10];
		int [] vetorB = new int [vetorA.length];
		
		for (int i = 0; i < vetorA.length; i ++) {
			System.out.print(i + "° posição do vetor, valor: ");
			vetorA[i] = scan.nextInt();			
			
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
		}
	}

}

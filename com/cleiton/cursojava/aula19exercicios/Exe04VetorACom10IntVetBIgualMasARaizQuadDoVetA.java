package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe04VetorACom10IntVetBIgualMasARaizQuadDoVetA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int [] vetorA = new int [10]; //Utilizarei 10 espaços... 
		int [] vetorB = new int [vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(i + "° valor: ");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i];
			vetorB[i] = (int) Math.sqrt(vetorA[i]);
			
		}
		
		System.out.println("Vetores A: ");
		for  (int i =0; i < vetorA.length; i++) {
			 System.out.println(i + "° posição do vetor = " + vetorA[i]);
			 
		}
		System.out.println("");
		System.out.println("Vetores B = raiz quadrada do Vetor A: ");
		for  (int i =0; i < vetorB.length; i++) {
			 System.out.println(i + "° posição do vetor = " + vetorB[i]);
			 
		}
		System.out.println("");
	
	}
}

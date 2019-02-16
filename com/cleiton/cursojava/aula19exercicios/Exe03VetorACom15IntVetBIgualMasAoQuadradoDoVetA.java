package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe03VetorACom15IntVetBIgualMasAoQuadradoDoVetA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int [] vetorA = new int [5];
		int [] vetorB = new int [vetorA.length];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(i + "° valor: ");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i];
			vetorB[i] = vetorA[i] * vetorA[i];
			
			
		}
		System.out.println ("Vetor A:");
		
		for (int i = 0; i < vetorA.length; i++) {
		System.out.print(i + "° posição do vetor = " + vetorA[i] + "\n");
		}
		System.out.println(""); //Pular linha
		
		System.out.println ("Vetor B = Vetor A^2:"); //Irá imprimir vetorB, ao quadrado do vetorA;
		
		for (int i = 0; i < vetorB.length; i++) {
		System.out.print(i + "° posição do vetor = " + vetorB[i] + "\n");
		}
		System.out.println("");		
		
	}

}

package com.cleiton.cursojava.aula19exercicios;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exe02VetACom8InteirosEVetBIgualMasMultiplicadoPor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int [] vetorA = new int [5];
		int [] vetorB = new int [vetorA.length];
				
		
		for (int i = 0; i < vetorA.length; i ++) {
			
			System.out.println(i + " posição valor: ");
			vetorA[i] = scan.nextInt();
						
			vetorB[i] = vetorA[i];
			vetorB [i] *= 2;
			
			//Vetor B na posição I , vai receber o Vetor A da posição I;
		}
				
		System.out.println("Vetor A: ");
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.print(vetorA[i] + " - ");
		}
		System.out.println();		
		
		System.out.println("Vetor B: ");
		
		for (int i = 0; i < vetorB.length; i++) {
			
			System.out.print(vetorB[i] + " - ");
		}
		System.out.println("");
		
		//Utilizando Loop For Each 
		
		System.out.println("Usando For Each: ");
		
		for (int vetor : vetorB) {
			System.out.println(vetorB + " - ");
		}
		 
		
	}

}

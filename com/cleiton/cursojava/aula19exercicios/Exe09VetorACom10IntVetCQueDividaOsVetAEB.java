package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe09VetorACom10IntVetCQueDividaOsVetAEB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int [] vetorA = new int [10]; 
		int [] vetorB = new int [10];
		int [] vetorC = new int [10];
		
		System.out.println(" 1° Vetor (A): ");
		for (int i = 0; i < vetorA.length; i ++) {
			System.out.print(i + "° posição valor = ");
			vetorA[i] = scan.nextInt();
		}
		System.out.println("");
		System.out.println(" 2° Vetor (B): ");
		for (int i = 0; i < vetorB.length; i ++) {
			System.out.print(i + "° posição valor = ");
			vetorB[i] = scan.nextInt();
		}		
		System.out.println("");
		System.out.println("Soma de Vetor C = A + B : ");
		for (int i = 0; i < vetorC.length; i ++) {
			
			vetorC[i] = vetorA[i] * vetorB[i];
			System.out.println(i + "° posicão, multiplição de " + vetorA[i] + " * " + vetorB[i] + " = " + vetorC[i]);
		}

	}

}

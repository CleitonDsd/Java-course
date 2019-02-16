package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe08VetorACom10IntVetCQueDividaOsVetAEB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		double [] vetorA = new double [2];
		double [] vetorB = new double [2];
		double [] vetorC = new double [2];
		
		System.out.println("");
		System.out.println("Vetor A:");		
		for(int i = 0 ; i < vetorA.length; i++ ) {
			System.out.print(i + "° valor = ");
			vetorA[i] = (double) scan.nextInt();						
		}
		System.out.println("");
		System.out.println("Vetor B:");
		for(int i = 0 ; i < vetorB.length; i++ ) {
			System.out.print(i + "° valor = ");
			vetorB[i] = (double) scan.nextInt();						
		}
		System.out.println("");
		System.out.println("Vetor C: Vetor A / Vetor B =");
		for(int i = 0 ; i < vetorC.length; i++ ) {
			vetorC[i] = vetorA[i] / vetorB[i] ;			
			System.out.println (i + "° posição, resultado de " + vetorA[i] + " / " +  vetorB[i] + " = " + vetorC[i]);									
		}
	}

}

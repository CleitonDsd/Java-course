package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe15VetorA10IntDefinirPorcentagemDeParEImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int [] vetorA = new int [10];
		
		for (int i = 0 ; i < vetorA.length; i++) {
			
			System.out.print(i + "° posição do vetor, valor: ");
			vetorA[i] = scan.nextInt();	
		}
		
		int impar = 0 ;
		
		for (int i = 0; i< vetorA.length; i++) {
			if (vetorA[i] % 2 == 1) {
				impar++; 
			}
		}
		int par = vetorA.length - impar; 
		
		double porcPar = (par * 100 )/vetorA.length;
		double porcImpar = 100 - porcPar;
		
		System.out.println(" ");
		
		System.out.println("Porcentagem de Pares: " + porcPar + "%");
		System.out.println("Porcentagem de Impares: " + porcImpar + "%");
	}

}

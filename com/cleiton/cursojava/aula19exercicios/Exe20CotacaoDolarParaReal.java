package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe20CotacaoDolarParaReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		double [] vetorA = new double [20];
		double cotacao;
		
		System.out.println("Digite a cotação do dólar: ");
		cotacao = scan.nextDouble();
		
		for (int i = 0 ; i < vetorA.length; i ++) {
			vetorA[i] = cotacao * (i+1);			
		}
		System.out.println("");
		System.out.print("Vetor A ");
		for (int i = 0 ; i < vetorA.length ; i ++) {
			
			System.out.print(vetorA[i] + " ");
			
		}
	}

}

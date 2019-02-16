package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe24VerificarSeVetorEPalindromos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);

		int [] vetorA = new int [10];
		
		for (int i = 0; i < vetorA.length; i ++) {
			System.out.print(i + "° posição do vetor, valor: ");
			vetorA[i] = scan.nextInt();
			
			
		}
		boolean palindromo = true;
		
		for (int i = 0; i < vetorA.length; i ++) {
			if (vetorA[i] == vetorA[vetorA.length - 1 - i]) {
				System.out.println("");
				palindromo = false;
				break;
			}
			System.out.println("");
			
			if (palindromo) {
				System.out.println("Palíndromo");
			}else
				System.out.println("Não é Palíndromo");
			}						
	}

}

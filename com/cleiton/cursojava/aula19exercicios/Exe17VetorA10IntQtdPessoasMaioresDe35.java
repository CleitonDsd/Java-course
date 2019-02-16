package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe17VetorA10IntQtdPessoasMaioresDe35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan = new Scanner (System.in);
		
		int [] vetorA = new int [10];
		
		for (int i = 0 ; i < vetorA.length; i++) {
			
			System.out.print(i + "° posição do vetor, idade: ");
			vetorA[i] = scan.nextInt();	
		}
		int quantidade = 0;
		for (int i = 0 ; i < vetorA.length; i++) {
			if (vetorA[i] > 35) {
				quantidade+=1;
			}
		}
		System.out.println("");
		for (int i = 0 ; i < vetorA.length; i++) {
			
			System.out.println(i + "° posição do vetor, idade: " + vetorA[i]);				
		}
		System.out.println("");
		System.out.println("Quantidade de pessoas com idade > 35" + quantidade);
		
	}

}

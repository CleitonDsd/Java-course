package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe18VetorA10IntMenorIdadeEMaiorIdadeEPosicaoDaIdadeNoVet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int [] idades = new int [10];
		
		for (int i = 0 ; i < idades.length; i++) {
			
			System.out.print(i + "° posição do vetor, idade: ");
			idades[i] = scan.nextInt();	
		}
		int menor = idades[0], indexMenor = 0;		
		int maior = idades[0], indexMaior = 0;;
		
		for (int i = 1 ; i < idades.length; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				indexMaior = i;
			}else if (idades[i] < menor){
				menor = idades[i];
				indexMenor = i;
			}		
		}
		System.out.println("");
		for (int i = 1 ; i < idades.length; i++) {
				
			System.out.print(idades[i] + " " );				
			}
			System.out.println("");
			System.out.println("Menor Idade(s): " + menor );
			System.out.println("Índice menor idade : " + indexMenor );
			System.out.println("Maior Idade(s): " + maior );
			System.out.println("Índice maior idade : " + indexMaior);
	}

}

package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe08Informe5NumerosImprimaSomaEMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);
		
		
		int numero,
			soma,
			media,
			maiorNumero,
			menorNumero,
			cont = 5;
		
		System.out.println("Insira um n�mero: ");
		numero = scan.nextInt();
		
		menorNumero = numero;
		maiorNumero = numero;
		soma = numero;
		media = numero;
		
		for (int i = 1; i < cont; i++) {
			System.out.println("Insira um n�mero: ");
			numero = scan.nextInt();
						
			if (numero > maiorNumero) {
				maiorNumero = numero;				
			}
			if (numero < menorNumero) {
				menorNumero = numero;				
			}
			
			soma += numero;
			media = soma/numero;
		}
			System.out.println("Soma dos n�meros : " + soma);
			System.out.println("M�dia dos n�meros : " + media);
			System.out.println("Maior numero lido : " + maiorNumero);
			System.out.println("Menor numero lido : " + menorNumero);

	}

}

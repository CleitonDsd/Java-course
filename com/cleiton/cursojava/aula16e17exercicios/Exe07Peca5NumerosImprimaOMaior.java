package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe07Peca5NumerosImprimaOMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		
		int numero,
			maiorNumero,
			menorNumero,
			cont = 5;
		
		System.out.println("Insira um número: ");
		numero = scan.nextInt();
		
		menorNumero = numero;
		maiorNumero = numero;
		
		for (int i = 1; i < cont; i++) {
			System.out.println("Insira um número: ");
			numero = scan.nextInt();
			
			if (numero > maiorNumero) {
				maiorNumero = numero;				
			}
			if (numero < menorNumero) {
				menorNumero = numero;				
			}
		}
			System.out.println("Maior numero lido : " + maiorNumero);
			System.out.println("Menor numero lido : " + menorNumero);
	}

}

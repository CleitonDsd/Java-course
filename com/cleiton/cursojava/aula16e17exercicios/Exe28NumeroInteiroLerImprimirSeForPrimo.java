package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe28NumeroInteiroLerImprimirSeForPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int numero;
						
		for (int i = 1; ; i++) {
			
			System.out.print("Digite um n�mero: ");
			numero = scan.nextInt();
			System.out.println("");
			
			if (numero % numero == 0) {
				System.out.println(numero + ", � um n�mero PRIMO");
				break;
			}else {
				System.out.println(numero + ", N�O � um n�mero PRIMO");
				break;
			}
			
		}
		System.out.println("");
		System.out.println("Fim do programa");

	}

}

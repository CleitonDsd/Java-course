package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe10Leia2NumerosInteirosGerarNumeroDoIntervalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j,
			numero1 = 0,
			numero2 = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o 1° número: ");
		numero1 = scan.nextInt();
		
		System.out.println("Digite o 2° número: ");
		numero2 = scan.nextInt();
		
		for (i = numero1++; i < numero2; i++) {
			System.out.println("");
			System.out.println(i);
		}
		for (i = numero2++; i < numero1; i++) {
			System.out.println("");
			System.out.println(i);
		}
	}

}


package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe30TabuadaInicioFimConformeUsuarioQueira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int numero=1, inicio = 0 , termino = 0;
		
		
		System.out.print("Come�ar por: ");
		inicio = scan.nextInt();
		System.out.print("Terminar em: ");
		termino = scan.nextInt();
		
		for (int i = 1; i <= termino; i ++) {
			for (i = 1; inicio < termino; )
			
			if (numero <0) {
				System.out.println("Valor inserido inv�lido, digite novamente: ");
				numero = scan.nextInt();
			}
			System.out.println("Qual tabuada deseja saber (1-10): ");
			numero = scan.nextInt();
			
			
			System.out.println("Tabuada do " + numero + ": ");
			System.out.println(numero + " X 1 = " + numero * 1);
			System.out.println(numero + " X 2 = " + numero * 2);
			System.out.println(numero + " X 3 = " + numero * 3);
			System.out.println(numero + " X 4 = " + numero * 4);
			System.out.println(numero + " X 5 = " + numero * 5);
			System.out.println(numero + " X 6 = " + numero * 6);
			System.out.println(numero + " X 7 = " + numero * 7);
			System.out.println(numero + " X 8 = " + numero * 8);
			System.out.println(numero + " X 9 = " + numero * 9);
			System.out.println(numero + " X 10 = " + numero * 10);
			
			numero --;
			
			
		}

	}

}

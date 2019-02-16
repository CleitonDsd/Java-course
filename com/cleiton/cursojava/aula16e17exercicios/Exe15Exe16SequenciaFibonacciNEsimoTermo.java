package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe15Exe16SequenciaFibonacciNEsimoTermo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Scanner scan = new Scanner (System.in);
		
		int anterior = 1, atual = 0, proximo = 0;
		
		while (proximo <= 500) {
			 proximo = anterior + atual;
			 
			 System.out.println(proximo);
			 anterior = atual;
			 atual = proximo;
		}
	}

}

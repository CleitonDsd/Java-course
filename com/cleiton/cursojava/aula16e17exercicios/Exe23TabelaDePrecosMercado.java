package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe23TabelaDePrecosMercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		double preco = 1.99 ;
		
		for (int i = 1; i <=50 ; i++) {		
			
			System.out.printf(i + " - Preço (R$): %.2f\n ", preco);			
			preco *= 2;		
		}
	}

}

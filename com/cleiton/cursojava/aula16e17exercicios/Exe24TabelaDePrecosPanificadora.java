package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe24TabelaDePrecosPanificadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		double pao = 0.18 ;
		
		for (int i = 1; i <=50 ; i++) {		
			
		System.out.printf(i + " - Preço (R$): %.2f\n ", pao);	
			pao *= 2;		
		}	
		

	}

}

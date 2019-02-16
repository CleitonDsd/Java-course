package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe19MediaAritmeticaDeNotaN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int nota = 0 , 
			quantNotas = 0, //Quantidade de Notas
			media = 0,
			soma = 0;
		
		System.out.println("Quantas números quer calcular");
		quantNotas = scan.nextInt();
		
		for(int i =1 ; i<= quantNotas ; i++ ) {
			
			System.out.println(i + "° Nota: ");
			nota = scan.nextInt();
			
			soma += nota;
			media = soma/quantNotas;
			  
		}
			System.out.println("Média das notas: " + media);
				
		
	}

}

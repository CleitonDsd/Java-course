package com.cleiton.cursojava.aula13exercicios;

import java.util.Scanner;

public class Exercicio05MetrosParaCm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite o valor em Metros: ");
		float metro = scan.nextFloat();
		float cent;
		cent = metro*100;
		System.out.println("O valor em centrimetros é: " + cent + " CM");
		

	}

}

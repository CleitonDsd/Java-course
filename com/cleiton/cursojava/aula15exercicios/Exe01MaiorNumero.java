package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe01MaiorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o primeiro valor: ");
		byte numero1 = scan.nextByte();
		System.out.print("Digite o segundo valor: ");
		byte numero2 = scan.nextByte();
		
		if (numero1 > numero2) {
			System.out.println("O primeiro valor ' " + numero1 + " ' é maior.");
		}
		if (numero2 > numero1){
			System.out.println("O segundo valor ' " + numero2 + " ' maior.");
		}
		if (numero1 == numero2) {
			System.out.println("Os numeros são iguais."); 
		}
	}

}

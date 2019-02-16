package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe04VogalOuConsoante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite uma letra: ");
		char letra;
		letra = scan.next().charAt(0);
		
		switch (letra){
		case 'a' : System.out.println("Vogal"); break;
		case 'e' : System.out.println("Vogal"); break;
		case 'i' : System.out.println("Vogal"); break;
		case 'o' : System.out.println("Vogal"); break;
		case 'u' : System.out.println("Vogal"); break;
		
		case 'A' : System.out.println("Vogal"); break;
		case 'E' : System.out.println("Vogal"); break;
		case 'I' : System.out.println("Vogal"); break;
		case 'O' : System.out.println("Vogal"); break;
		case 'U' : System.out.println("Vogal"); break;
		
		default:
			System.out.println("Consoante"); 

		}
		

	}

}

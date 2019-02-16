package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exe05InsiraOsValoresExeIgualAo4MasComUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);		
		
		double 					
		   	   paisA , //Habitantes do Primeiro País;
			   paisB , //Habitantes do Segundo País;;
			   crescA,
			   crescB;
		
		int ano=0;		
		
		System.out.println("Digite o numero de habitantes do 1° pais: ");
		paisA = scan.nextDouble();
		System.out.println("Insira o crescimento anual do 1° país (%): ");
		crescA = scan.nextDouble();
		
		System.out.println("Digite o numero de habitantes do  2° país: ");
		paisB = scan.nextDouble();
		System.out.println("Insira o crescimento anual do 2° país (%): ");
		crescB = scan.nextDouble();
		
		
			while (paisA <= paisB) {																  
		
				paisA *=  (crescA)/100;
				paisB *=  (crescB)/100;			
				ano+=1;		
								
		}		
			System.out.println("Ultrapassa ou Iguala em " + ano + " anos");
			while (paisA >= paisB) {																  
		
				paisA *=  (crescA)/100;
				paisB *=  (crescB)/100;				
				ano+=1;		
				
		}		
			System.out.println("Ultrapassa ou Iguala em " + ano + " anos");
	}

}

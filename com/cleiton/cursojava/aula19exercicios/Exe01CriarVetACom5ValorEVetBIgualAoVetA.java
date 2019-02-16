package com.cleiton.cursojava.aula19exercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exe01CriarVetACom5ValorEVetBIgualAoVetA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);	
		
		/* * *
		 * int [] a = new int [5];
		int [] b = new int [5];
		
		a [1] = 2; a [2] = 4;  a [3] = 6;  a [4] = 8;  a [5] = 10;
		b [1] = 2; b [2] = 4;  b [3] = 6;  b [4] = 8;  b [5] = 10;
		
		int [] a = {2,4,6,8,10};
		int [] b = {2,4,6,8,10};
	  //int [] b = Arrays.copyOf(a, a.length); 
		
		
		for (int i = 0; i<a.length; i++) {
			System.out.print(" . " + a[i]);			
		}
	   //Arrays.sort(b);
		for (int i = 0; i<b.length; i++) {
			System.out.print("\n - " + b[i] );			
		}
		scan.close();
		
		* * */
		
		int [] vetorA = new int [5];
		int [] vetorB = new int [vetorA.length];
		
		for (int i = 0; i < vetorA.length; i ++) {
			
			System.out.println(i + " posição valor: ");
			vetorA[i] = scan.nextInt();
						
			vetorB[i] = vetorA[i];
			
			//Vetor B na posição I , vai receber o Vetor A da posição I;
		}
				
		System.out.println("Vetor A: ");
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.print(vetorA[i] + " - ");
		}
		System.out.println();		
		
		System.out.println("Vetor B: ");
		
		for (int i = 0; i < vetorB.length; i++) {
			
			System.out.print(vetorB[i] + " - ");
		}
		
				
	}

}

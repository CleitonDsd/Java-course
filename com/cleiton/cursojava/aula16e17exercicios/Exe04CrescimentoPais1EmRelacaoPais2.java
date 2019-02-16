package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe04CrescimentoPais1EmRelacaoPais2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		
		double 					
		   	   paisA = 8000, //Taxa percentual de 3% ao ano;
			   paisB = 20000; // Taxa percentual de 1.5% ao ano;
			   
		int ano=0;
					
		while (paisA <= paisB) {																  
				paisA *=  0.03;
				paisB *=  0.015;
				
				ano+=1;
		}
		
		System.out.println("Ultrapassa ou Iguala em " + ano + " anos");
		

	}

}

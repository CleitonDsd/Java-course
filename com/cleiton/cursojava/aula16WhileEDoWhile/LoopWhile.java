package com.cleiton.cursojava.aula16WhileEDoWhile;

public class LoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0; //contador
		int max = 10; //maximo
		
		System.out.println("Contando at� " + max);
		
		while (i <= max ) {
			System.out.println("valor de I: " + i);
			i++; // i = i +1; ou i=+ i;
		}
		 
		/*Valor de i == 11
		 * por conta do p�s incremento,
		 * como o loop while � de i at� <= 10
		 * as express�o seguinte do p�s incremente se torna falsa
		 * portanto n�o � imprimida, mas fora do bloco do loop, 
		 * el� valer� 11;
		 *  */
		System.out.println("");
		System.out.println("Valor de I (fora do loop While) :" + i);

	}

}

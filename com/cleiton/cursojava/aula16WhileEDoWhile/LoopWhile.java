package com.cleiton.cursojava.aula16WhileEDoWhile;

public class LoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0; //contador
		int max = 10; //maximo
		
		System.out.println("Contando até " + max);
		
		while (i <= max ) {
			System.out.println("valor de I: " + i);
			i++; // i = i +1; ou i=+ i;
		}
		 
		/*Valor de i == 11
		 * por conta do pós incremento,
		 * como o loop while é de i até <= 10
		 * as expressão seguinte do pós incremente se torna falsa
		 * portanto não é imprimida, mas fora do bloco do loop, 
		 * elá valerá 11;
		 *  */
		System.out.println("");
		System.out.println("Valor de I (fora do loop While) :" + i);

	}

}

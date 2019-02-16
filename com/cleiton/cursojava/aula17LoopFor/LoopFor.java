package com.cleiton.cursojava.aula17LoopFor;

public class LoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FOR SIMPLES
		System.out.println("For com uma variável");
		System.out.println("Ordem Crescente:");
		for (int i = 0 ; i < 5 ; i++) {
		System.out.println("Valor de i: " + i);
		}
		
		// i no caso são variaveis Locais, pertecente ao bloco For
		
		System.out.println("");
		System.out.println("Ordem Derescente:");
		for (int i = 5 ; i > 0 ; i--) {
		System.out.println("Valor de i: " + i);
		
		}
		System.out.println("");
		
		System.out.println("FOR com mais de uma Variável");
		//FOR COM MAIS DE UMA VARIÁVEL
		
		for (int i = 0 , j = 10; i < j ; i++ , j--) {
			System.out.println("i = " + i + "; j = " + j + ";");
			System.out.println("");
		/*Não imprimi valor de 5 pois 5 (i <j), não é menor que 5,
		 *  então é uma expressão falsa, se fosse i <= j
		 *  o valor de 5 seria impresso, mas como não, se torna uma
		 *  expressão falsa
		 */
		}
		

		System.out.println("FOR com partes Ausentes");
		//FOR COM PARTES AUSENTES
		
		int count = 0; // count = cont; De contador.
		for (; count < 5 ;) {
			System.out.println("Valor de count : " + count);
			count += 2; // Mesma coisa que: count++ ; count = count + 1;
			//<< Vai contar a cada 2 >>
		}
	}

}



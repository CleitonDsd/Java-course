package com.cleiton.cursojava.aula17LoopFor;

public class LoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FOR SIMPLES
		System.out.println("For com uma vari�vel");
		System.out.println("Ordem Crescente:");
		for (int i = 0 ; i < 5 ; i++) {
		System.out.println("Valor de i: " + i);
		}
		
		// i no caso s�o variaveis Locais, pertecente ao bloco For
		
		System.out.println("");
		System.out.println("Ordem Derescente:");
		for (int i = 5 ; i > 0 ; i--) {
		System.out.println("Valor de i: " + i);
		
		}
		System.out.println("");
		
		System.out.println("FOR com mais de uma Vari�vel");
		//FOR COM MAIS DE UMA VARI�VEL
		
		for (int i = 0 , j = 10; i < j ; i++ , j--) {
			System.out.println("i = " + i + "; j = " + j + ";");
			System.out.println("");
		/*N�o imprimi valor de 5 pois 5 (i <j), n�o � menor que 5,
		 *  ent�o � uma express�o falsa, se fosse i <= j
		 *  o valor de 5 seria impresso, mas como n�o, se torna uma
		 *  express�o falsa
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



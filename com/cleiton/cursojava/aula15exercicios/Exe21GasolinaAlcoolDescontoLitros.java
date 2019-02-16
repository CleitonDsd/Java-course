package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe21GasolinaAlcoolDescontoLitros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Alcool (a):");
		System.out.println("Pre�o por Litro: R$ 1,90");
		System.out.println("At� 20 L, desconto por 3% por Litro");
		System.out.println("Acima 20 L, desconto por 5% por Litro");
		System.out.println("");
		
		System.out.println("Gasolina (g):");
		System.out.println("Pre�o por Litro: R$ 2,50");
		System.out.println("At� 20 L, desconto por 4% por Litro");
		System.out.println("Acima 20 L, desconto por 6% por Litro");
		System.out.println("");
		
		System.out.println("Alcool (a) ou Gasolina (g) ?");
		char resposta = scan.next().charAt(0);
		
		System.out.println("Quantos litros (l) voc� deseja comprar?");
		double litros = scan.nextDouble();
		
		//Aplicando desconto At� 20L ALCOOL
		double precoAlcool20 = litros * 1.90; //Pre�o total por litro do Alcool
		double descontoAlcool20 = (((1 - 0.03)*precoAlcool20)/litros); //Calculando Desconto at� 20L
		double precoTotalAlcool20 = precoAlcool20 - descontoAlcool20;	//Aplicando Desconto no preco	
		
		//Aplicando desconto Acima 20L ALCOOL
		double precoAlcool = litros * 1.90; //Pre�o total por litro do Alcool
		double descontoAlcool = (((1 - 0.05)*precoAlcool)/litros); //Calculando Desconto at� 20L
		double precoTotalAlcool = precoAlcool - descontoAlcool;	//Aplicando Desconto no preco	
		
		//Aplicando desconto at� 20L GASOLINA
		double precoGasolina20 = litros * 2.50; //Pre�o pre�o por litro da Gasolina
		double descontoGasolina20 = (((1 - 0.04)*precoAlcool20)/litros); //Calculando Desconto at� 20L
		double precoTotalGasolina20 = precoAlcool20 - descontoAlcool20;	//Aplicando Desconto no preco
		
		//Aplicando desconto acima 20L GASOLINA
		double precoGasolina = litros * 2.50; //Pre�o pre�o por litro da Gasolina
		double descontoGasolina = (((1 - 0.06)*precoAlcool)/litros); //Calculando Desconto at� 20L
		double precoTotalGasolina = precoAlcool - descontoAlcool;	//Aplicando Desconto no preco
		
		if (resposta == 'a') {
			
			if (litros <= 20) {
			System.out.println ("Pre�o (R$): " + precoAlcool20);	
			System.out.println ("Pre�o com Desconto (R$): " + precoTotalAlcool20);
			}
			else if (litros >= 20) {
				System.out.println ("Pre�o (R$): " + precoAlcool);	
				System.out.println ("Pre�o com Desconto (R$): " + precoTotalAlcool);
				}
		}
		if (resposta == 'g') {
			
			if (litros <= 20) {
			System.out.println ("Pre�o (R$): " + precoGasolina20);	
			System.out.println ("Pre�o com Desconto (R$): " + precoTotalGasolina20);
			}
			else if (litros >= 20) {
				System.out.println ("Pre�o (R$): " + precoGasolina);	
				System.out.println ("Pre�o com Desconto (R$): " + precoTotalGasolina);
				}
		}
		
		if (resposta != 'g' && resposta != 'a') {
			System.out.println("Caractere Inv�lido");
		}
		

	}

}

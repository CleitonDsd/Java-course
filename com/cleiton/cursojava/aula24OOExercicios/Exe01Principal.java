package com.cleiton.cursojava.aula24OOExercicios;

import com.cleiton.cursojava.aula24OOClasses.Carro;

public class Exe01Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exe01Lampada lampada1 = new Exe01Lampada();

		lampada1.marca = "Phillips";
		lampada1.tipo = "Led";
		lampada1.voltagem = 127;
		lampada1.preco = 23.0;

		Exe01Lampada lampada2 = new Exe01Lampada();

		lampada2.marca = "Toshiba";
		lampada2.tipo = "Fluorescente";
		lampada2.voltagem = 227;
		lampada2.preco = 14.0;

		System.out.println("Lampadas em Estoque:");
		System.out.println();
		System.out.println("=====================================");
		System.out.println(" Lampada 1:");
		System.out.println();
		System.out.println(" Marca: " + lampada1.marca + "\n" + " Tipo: " + lampada1.tipo + "\n" + " Voltagem: "
				+ lampada1.voltagem + "\n" + " Preço (R$): " + lampada1.preco);
		System.out.println();
		System.out.println("=====================================");
		System.out.println(" Lampada 2:");
		System.out.println();
		System.out.println(" Marca: " + lampada2.marca + "\n" + " Tipo: " + lampada2.tipo + "\n" + " Voltagem: "
				+ lampada2.voltagem + "\n" + " Preço (R$): " + lampada2.preco);
		
	}

}

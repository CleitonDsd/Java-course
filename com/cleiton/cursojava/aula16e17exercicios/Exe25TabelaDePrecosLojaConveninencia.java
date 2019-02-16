package com.cleiton.cursojava.aula16e17exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Exe25TabelaDePrecosLojaConveninencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		double preco = 0,
			   total = 0,
			   troco = 0,			   
			   valorRecebido = 0;
		String entrada;
		String opcao;
		
		do {
			
			JOptionPane.showMessageDialog (null, "Instruções para uso do programa:" +
			"\n '0' encerra o Programa" +			
			"\n [s/S] Para continuar num novo programa" +
			"\n [n/N] Para Finalizar o Programa");
					
			JOptionPane.showMessageDialog (null, "!!! INICIO DO PROGRAMA !!!");
			
			DecimalFormat df = new DecimalFormat ("00.000"); //LIMITAR CASA DECIMAL, IGUAL NO PRINTF (%.2F);
			
			for (int i = 1; ; i++) {
				entrada = JOptionPane.showInputDialog(i + "° Produto : R$ " ); //LER DADO COM JOptionPane;
				preco = Double.parseDouble(entrada); //CONVERTER MENSAGEM DE STRING, PARA DOUBLE
				
				if (preco == 0 ) {
					break; //Se o valor inserido for 0, loop será finalizado;
				}
				else if (preco < 0) {
					JOptionPane.showInputDialog(null, "Preço Inválido, digite novamente: ");
					preco = Double.parseDouble(entrada);		
				}
				
				total += preco; //SOMAR O TOTAL DOS PREÇOS;
										
				}	
						
				entrada = JOptionPane.showInputDialog("Insira Valor Recebido: "); //Valor Pago Pelo CLiente
				valorRecebido = Double.parseDouble(entrada);;
				
				troco = valorRecebido - total;
				
				if (valorRecebido < 0) {
					
					entrada = JOptionPane.showInputDialog("Valor Inválido, digite novamente: ");
					valorRecebido = Double.parseDouble(entrada);;
				}
				else if (valorRecebido == 0) {
					JOptionPane.showMessageDialog(null, "!!! COMPRA NÃO AUTORIZADA !!!");
				}
				else if (valorRecebido >0 ) {
				JOptionPane.showMessageDialog(null, "Total: R$ "  + total +
								   "\n Valor Recebido: R$ " + valorRecebido +
													"\n Troco: R$ " + troco);
				}
				
				opcao = JOptionPane.showInputDialog(null, "Deseja continuar ? [s/n] ");			
				
		}while (opcao == "s" || opcao == "S"); 			
			
			//Se digitar "S" ou "s", realizará loop voltando ao inicio, do contrario término do programa;	
			
			JOptionPane.showMessageDialog(null, "° FIM DO PROGRAMA °");
	
	}

}

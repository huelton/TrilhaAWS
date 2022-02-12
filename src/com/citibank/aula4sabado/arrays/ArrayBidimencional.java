package com.citibank.aula4sabado.arrays;

import java.util.Scanner;

public class ArrayBidimencional {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		String[][] nomes = new String[2][2]; 
		double soma = 0.0;
		int count = 0;
		
		nomes[0][0] = "Huelton";
		nomes[0][1] = "Santos";
		nomes[1][0] = "Jose";
		nomes[1][1] = "Santos";
		
		double[][] valores = new double[2][4];		
		
		//System.out.println(nomes[0][0]+" "+nomes[0][1]);
		//System.out.println(nomes[1][0]+" "+nomes[1][1]);
		
		for(int i = 0; i < valores.length; i++) {	
			
			for(int j = 0; j < valores[i].length - 1; j++) {				
				System.out.println("insira o valor no indice["+i+"]["+j+"] ");
				valores[i][j] = sc.nextDouble();
				soma += valores[i][j];	
				count ++;
			}
			
			valores[i][count] = soma;
			soma = 0;
			count = 0;
		}		
		
		for(int i = 0; i < valores.length; i++) {			
			for(int j = 0; j < valores[i].length; j++) {				
				System.out.println("valor no indice["+i+"]["+j+"] "+ valores[i][j]);							
			}
		}

       sc.close();
	}

}

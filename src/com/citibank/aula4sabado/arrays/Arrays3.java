package com.citibank.aula4sabado.arrays;

import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String opc;
		double nota = 0.0;
		char notaPorExtenso = 0;
		int qtdNotasA = 0;
		int qtdNotasB = 0;
		int qtdNotasC = 0;
		int qtdNotasD = 0;
		
		char[] listaDeNotas = { 'A', 'B', 'C', 'D' };
		int[] sumarizacaoDeNotas = new int[4];
		
		do {
			System.out.println("Digite sua nota: ");
			nota = sc.nextDouble();
			
				if(nota >= 8.0) {
					notaPorExtenso = listaDeNotas[0];
				    qtdNotasA++;
				}else if(nota >= 6.0 && nota < 8.0) {
					notaPorExtenso = listaDeNotas[1];
				    qtdNotasB++;
				}
			
			System.out.println("Sua nota ficou em "+ notaPorExtenso);
			
			System.out.println("Deseja continuar inserindo notas? Sim ou Nao");
			opc = sc.next();
			
		} while(opc.equalsIgnoreCase("sim"));
        
		sumarizacaoDeNotas[0] = qtdNotasA;
		sumarizacaoDeNotas[1] = qtdNotasB;
		
		System.out.println("Sumarização das notas na Escola:");
		for(int i = 0; i < sumarizacaoDeNotas.length; i++) {
			System.out.println("Sumarização da nota "+listaDeNotas[i]+ " quantidade de "+ sumarizacaoDeNotas[i]+" notas");
		}

		System.out.println("");

	}

}

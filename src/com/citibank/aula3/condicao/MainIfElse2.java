package com.citibank.aula3.condicao;

import java.util.Scanner;

public class MainIfElse2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a media do Aluno:");
		double media = sc.nextDouble();
		
		System.out.println("Digite a Frequência do aluno:");
		double frequencia = sc.nextDouble();		
		
		// condição ? campo verdadeiro : campo falso;		
		System.out.printf("Status do Aluno: ");
		System.out.println((media >= 7.0 && frequencia > 0.75) ? "Aluno passou" : "Aluno reprovado");


	}

}

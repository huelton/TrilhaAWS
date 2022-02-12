package com.citibank.aula3.repeticao;

import java.util.Scanner;

public class MainFor2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double soma = 0.0;
		System.out.println("Entre com o nome do Aluno:");
		String nome = sc.next();
		System.out.println("Entre com a quantidade de provas do Aluno:");
		int qtd = sc.nextInt();

		for (int i = 0; i < qtd; i++) {
			System.out.println("Entre com a " + (i + 1) + " nota do Aluno: " + nome);
			double nota = sc.nextDouble();
			// acumulador
			soma += nota;
		}

		System.out.printf("A media do Aluno: %s é %.2f", nome, (soma / qtd));

	}

}

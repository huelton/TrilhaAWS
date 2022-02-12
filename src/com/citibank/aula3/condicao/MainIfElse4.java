package com.citibank.aula3.condicao;

import java.util.Scanner;

public class MainIfElse4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota:");
		double nota = sc.nextDouble();
		
		System.out.println("Digite a Frequência do aluno:");
		double frequencia = sc.nextDouble();		
		
		if((nota >= 7) && (frequencia > 0.75)) {
			System.out.println("Aluno Aprovado");
		}else {
			System.out.println("Aluno Reprovado");
		}

	}

}

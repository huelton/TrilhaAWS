package com.citibank.aula3.condicao;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double calculo = 0.0;

		System.out.println("Digite um numero:");
		double num1 = sc.nextDouble();
		System.out.println("Digite um outro numero:");
		double num2 = sc.nextDouble();

		System.out.println("Digite a Opera��o Matematica:(+-*/)");
		String operador = sc.next();

		switch (operador) {

		case "+":
			calculo = num1 + num2;
			System.out.println("A soma dos valores �: " + calculo);
			break;
		case "-":
			calculo = num1 - num2;
			System.out.println("A subtra��o dos valores �: " + calculo);
			break;
		case "*":
			calculo = num1 * num2;
			System.out.println("A multiplica��o dos valores �: " + calculo);
			break;
		case "/":
			calculo = num1 / num2;
			System.out.println("A divis�o dos valores �: " + calculo);
			break;

		default:
			System.out.println("Operador Matematico invalido");
			break;
		}

		sc.close();

	}

}

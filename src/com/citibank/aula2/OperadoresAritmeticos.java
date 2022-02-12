package com.citibank.aula2;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int num1 = 4, num2 = 7;		
		int soma = num1 + num2;
		
		int subtracao = num1 - num2;
		double multiplicacao = num1 * num2;
		double divisao = num2 / num1;
		double resto = num2 % num1;
		
		double pi = Math.PI;
		double valorRaiz = Math.sqrt(49);		
		double potencia = Math.pow(2,5);		
		final String VALIDACAO_PARAMETRO = "xpto";
		
		//area de circulo = raio * raio * pi;
		double raio = 2.0;
		double areaCirculo = Math.pow(raio,2) * Math.PI;		
		
		System.out.printf("Soma: %d %d %.2f \n", soma, subtracao, multiplicacao);
		System.out.println("Subtração: "+ subtracao);
		System.out.printf("Multiplicação: %.5f \n", multiplicacao);
		System.out.printf("Divisao: %.5f \n", divisao);
		System.out.printf("Resto: %.5f \n", resto);		
		System.out.println(((num1 * num2) / (num2 + num1)) % num2 );		
		System.out.println("Valor de PI: "+ pi);
		System.out.println("Raiz quadrada: "+ valorRaiz);
		System.out.println("Potencia: "+ potencia);
		System.out.printf("Area do Circulo: %.2f \n", areaCirculo);		
		

	}

}

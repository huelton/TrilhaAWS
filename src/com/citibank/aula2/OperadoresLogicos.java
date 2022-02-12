package com.citibank.aula2;

/*
 
    Operador            descrição
 -------------------------------------------------
       >                   maior
       >=                  maior igual
       <                   menor
       <=                  menor igual
       ==                  igual
       !=                  diferente
       !                   não
       
       && = e 
       || = ou
       Tabela verdade  
       
       V = verdadeiro  F = falso
       
       V && V = V
       V && F = F
       F && V = F
       F && F = F
       
       V || V = V
       V || F = V
       F || V = V
       F || F = F      
 
 */

public class OperadoresLogicos {

	public static void main(String[] args) {

		int num1 = 7;
		int num2 = 5;
		int num3 = 8;
		
		System.out.println(((num1 == num2) || (num1 < num2)) && (num1 > num3));

	}

}

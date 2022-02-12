package com.citibank.aula4sabado.oo;

public class Mamifero extends Animal{

	boolean vertebrado = true;	
	boolean endortermico = true;	
	
	public void periodoDeGestacaoParaProduzirLeite(char genero, boolean periodo) {
		if((genero == 'F' || genero == 'f') && periodo == true) {
			System.out.println("Produz Leite");
		}else {
			System.out.println("Não Produz Leite");
		}
	}
}

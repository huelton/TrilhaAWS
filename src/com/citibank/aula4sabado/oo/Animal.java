package com.citibank.aula4sabado.oo;

public class Animal extends SerVivo{
	
	public String anda() {
		return "Andando";
	}
	
	public String come() {
		return "Comendo";
	}
	
	public String fala(String tipoFala) {
		return "Minha linguagem é: " + tipoFala;
	}

}

package com.citibank.aula4sabado.oo.abstracao;

public abstract class Conta {

	String titular;
	int agencia;
	int numeroConta;
	double saldo;
	
	public void depositar(double valor) {
		saldo += valor;		
	}	
	
	//public abstract void saque(double valor);
	
	//public abstract void saque(double valor, taxaSaque);
	
	
	
}

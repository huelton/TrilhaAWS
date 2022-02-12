package com.citibank.aula4sabado.oo.abstracao;

public class ContaCorrente extends Conta implements ContaInterface{
	
	double taxaSaque = 0.50;

	@Override
	public void saque(double valor) {
		saldo = (saldo - valor) - taxaSaque;		
	}

}

package com.citibank.aula4sabado.oo.abstracao;

public class ContaPoupanca extends Conta implements ContaInterface{

	@Override
	public void saque(double valor) {
		saldo -= valor;
	}

}

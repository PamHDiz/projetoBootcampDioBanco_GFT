package br.com.dio.banco.modelo;

public class ContaPoupanca extends Conta {
	

	public ContaPoupanca(Titular titular) {
		super(titular);
	}
	
	@Override
	public String getTipo() {
		return "Conta Poupança";
	}
}
	

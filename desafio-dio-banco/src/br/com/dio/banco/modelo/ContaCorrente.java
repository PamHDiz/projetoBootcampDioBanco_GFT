package br.com.dio.banco.modelo;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Titular titular) {
		super(titular);
	}

	@Override
	public String getTipo() {
		return "Conta Corrente";
	}
	
	@Override
	public boolean saca(double valor) {
		if(valor > this.saldo) {
			System.out.println("Saldo insuficiente");
			return false;
		} else {
			this.saldo -= valor + 2.50;
			return true;
		}
	}

}

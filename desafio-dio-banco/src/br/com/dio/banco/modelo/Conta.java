package br.com.dio.banco.modelo;

public abstract class Conta implements ComportamentoContas {
	
	private static final String AGENCIA_PADRAO = "0001";
	private static int SEQUENCIAL = 1;
	
	
	protected Titular titular;
	protected String agencia;
	protected int numero = 0;
	protected double saldo = 0;
	
	public Conta(Titular titular) {
		this.titular = titular;
		this.numero = SEQUENCIAL++;
		this.agencia = AGENCIA_PADRAO;
	}
	
	@Override
	public void transfere(Conta destino, double valor) {
		if(this.saca(valor)) {
			destino.deposita(valor);
		}
	}
	
	@Override
	public boolean saca(double valor) {
		if(valor > this.saldo) {
			System.out.println("Saldo insuficiente");
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
	
	@Override
	public void deposita(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Digite um valor válido");
		}
	}
	
	public void ImpressaoExtrato() {
		System.out.println("\n**** Extrato " + this.getTipo() + "****");
		System.out.println("\nCliente: " + this.getTitular().getNome());
		System.out.println("Agencia: " + this.agencia + "    " + "Conta: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("-------------------------------");
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
}

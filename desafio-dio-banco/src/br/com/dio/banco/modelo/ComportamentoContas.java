package br.com.dio.banco.modelo;

public interface ComportamentoContas {
	
	boolean saca(double valor);
	
	void transfere(Conta destino, double valor);
	
	void deposita(double valor);
	
	String getTipo();
	
	void ImpressaoExtrato();
}

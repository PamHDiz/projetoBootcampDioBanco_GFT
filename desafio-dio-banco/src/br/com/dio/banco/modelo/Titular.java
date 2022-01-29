package br.com.dio.banco.modelo;

public class Titular {
	
	private String nome;
	private String cpf;
	private String profissao;
	private Endereco endereco;
	
	public Titular(String nome, String cpf, String profissao, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao; 
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}
	
}

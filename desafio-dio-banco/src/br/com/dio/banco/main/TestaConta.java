package br.com.dio.banco.main;

import br.com.dio.banco.modelo.ContaCorrente;
import br.com.dio.banco.modelo.ContaPoupanca;
import br.com.dio.banco.modelo.Endereco;
import br.com.dio.banco.modelo.Titular;

public class TestaConta {

	public static void main(String[] args) {
		
		Endereco end1 = new Endereco();
		end1.setCep("01341-001");
		end1.setLogradouro("Rua Morada da Programação");
		end1.setCidade("São Paulo");
		end1.setEstado("São Paulo");
		
		Titular titular1 = new Titular("Sandra Rosa Madalena","001.002.003-28","Desenvolvedora", end1);
		
		ContaCorrente cc1 = new ContaCorrente(titular1);
			
		
		Endereco end2 = new Endereco();
		end2.setCep("01212-001");
		end2.setLogradouro("Rua da Felicidade");
		end2.setCidade("São Paulo");
		end2.setEstado("São Paulo");
		
		Titular titular2 = new Titular("João das Neves","100.200.300-28","Engenheiro", end2);

		ContaPoupanca cp1 = new ContaPoupanca(titular2);
			
			
		
		Endereco end3 = new Endereco();
		Titular titular3 = new Titular("Rosa Rosalinda", "200.001.003-29","Enfermeira", end3);
		ContaCorrente cc2 = new ContaCorrente(titular3);
		
		//----------------------------------------------------------------------
		
		cc1.deposita(1000);
		cc2.deposita(500);
		cp1.deposita(2000);
		
		cc1.saca(200);
		System.out.println(cc1.getSaldo());
		
		cc2.transfere(cp1, 600);
		System.out.println(cp1.getSaldo());
		
		cc2.ImpressaoExtrato();
		cc1.ImpressaoExtrato();
		
		
	}

}

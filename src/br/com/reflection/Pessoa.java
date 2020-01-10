package br.com.reflection;

public class Pessoa {

	private String nome;
	private String cpf;
	private String rg;
	private int idade;

	public Pessoa(String nome, int idade, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public int getIdade() {
		return idade;
	}

}

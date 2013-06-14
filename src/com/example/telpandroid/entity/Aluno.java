package com.example.telpandroid.entity;

public class Aluno {

	private String nome;
	private String sobrenome;

	public String getNome() {
		return nome;
	}

	public Aluno setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public Aluno setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
		return this;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", nome, sobrenome);
	}

}

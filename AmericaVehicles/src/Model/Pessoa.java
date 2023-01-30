package Model;

import java.util.Date;

public abstract class Pessoa {
	
	/**
	 * Classe abstrata Pessoa que possui todos os elementos em comum entre as classe Cliente e Vendedor.
	 * @author Mayara Alves de Oliveira
	 * @since 2023
	 * @version 1.0
	 */

// Atributos 
	
	private String nome;
	private int rg;
	private int cpf;
	private int dataNascimento;
		
	/**
	 * Construtor da classe Pessoa.
	 * @param nome
	 * @param rg
	 * @param cpf
	 * @param dataNascimento
	 */
	
// Metodo construtor (Cadastrar)
	
	public Pessoa(String nome, int rg, int cpf, int dataNascimento) {
	super();
	this.nome = nome;
	this.rg = rg;
	this.cpf = cpf;
	this.dataNascimento = dataNascimento;
	}
	
// Metodos acessores (Criando Gets e Sets)
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}


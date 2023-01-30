package Model;

import java.util.Date;

public class Vendedor extends Pessoa {
	
	/**
	 * Classe Vendedor herda da Classe Pessoa e adicionar os atributos especificos de Vendedor.
	 * @author Mayara Alves de Oliveira
	 * @since 2023
	 * @version 1.0
	 */
	
// Atributos
	
	private String email;
	private String nacionalidade;
	private String naturalidade;

	/**
	 * Construtor da classe Vendedor.
	 * @param nome
	 * @param rg
	 * @param cpf
	 * @param dataNascimento
	 * @param email
	 * @param nacionalidade
	 * @param naturalidade
	 */
	
// Metodo construtor (cadastrar vendedor)
	
	public Vendedor(String nome, int rg, int cpf, int dataNascimento, String email, String nacionalidade,
			String naturalidade) {
		super(nome, rg, cpf, dataNascimento);
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.naturalidade = naturalidade;
	}
	
// Metodos acessores (gets e sets)
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public String getNaturalidade() {
		return naturalidade;
	}


	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
}

package Model;

import java.util.Date;

public class Cliente extends Pessoa {
	
	/**
	 * Classe Cliente herda da Classe Pessoa e adicionar os atributos especificos de Cliente.
	 * @author Mayara Alves de Oliveira
	 * @since 2023
	 * @version 2.0
	 */

// Atributos 
	
	private String profissao;
	private int renda;
	private String estadoCivil;
	private String nomeConjuge;

	
// Metodo construtor (Cadastrar Cliente) 
	
	/**
	 * Construtor da classe Vendedor.
	 * @param nome
	 * @param rg
	 * @param cpf
	 * @param dataNascimento
	 * @param profissao
	 * @param renda
	 * @param estadoCivil
	 * @param nomeConjuge
	 */
	
	public Cliente(String nome, int rg, int cpf, int dataNascimento, String profissao, int renda, String estadoCivil,
			String nomeConjuge) {
		super(nome, rg, cpf, dataNascimento);
		this.profissao = profissao;
		this.renda = renda;
		this.estadoCivil = estadoCivil;
		this.nomeConjuge = nomeConjuge;
	}

// Metodos Acessores (gets e sets)
	
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public int getRenda() {
		return renda;
	}

	public void setRenda(int renda) {
		this.renda = renda;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNomeConjuge() {
		return nomeConjuge;
	}

	public void setNomeConjuge(String nomeConjuge) {
		this.nomeConjuge = nomeConjuge;
	}
		
}

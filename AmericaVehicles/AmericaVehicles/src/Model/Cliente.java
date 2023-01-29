package Model;

import java.util.Date;

public class Cliente extends Pessoa {

// Atributos 
	
	private String profissao;
	private int renda;
	private String estadoCivil;
	private String nomeConjuge;

	
// Metodo construtor (Cadastrar Cliente) 
	
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

	
// Metodos deletar e editar 
	
	public void deletar () {
			
	}
	public void editar () {
			
	}
		
}

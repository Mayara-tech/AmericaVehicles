package Model;

import java.util.Date;

public class Cliente extends Pessoa {

// Atributos 
	
	private String profissao;
	private Float renda;
	private String estadoCivil;
	private String nomeConjuge;
	private String nomeMae;
	
// Metodo construtor (Cadastrar Cliente) 
	
	public Cliente(String nome, int rg, int cpf, Date dataNascimento, String profissao, Float renda, String estadoCivil,
			String nomeConjuge, String nomeMae) {
		super(nome, rg, cpf, dataNascimento);
		this.profissao = profissao;
		this.renda = renda;
		this.estadoCivil = estadoCivil;
		this.nomeConjuge = nomeConjuge;
		this.nomeMae = nomeMae;
	}

// Metodos Acessores (gets e sets)
	
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Float getRenda() {
		return renda;
	}

	public void setRenda(Float renda) {
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

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
// Metodos deletar e editar 
	
	public void deletar () {
			
	}
	public void editar () {
			
	}
		
// Metodos de buscar e vender
		
	public void buscarCliente () {
			
	}
	public void ComprarVeiculo () {
		
	}
}



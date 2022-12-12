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
	
	public Cliente(String nome, int rg, int cpf, int dataNascimento, String profissao, Float renda, String estadoCivil,
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

// Metodo teste
	public void ApresentarCliente() {
		System.out.print("========================== Lista de Clientes===================================\n");
		System.out.print("NOME: " + this.getNome() + "\n");
		System.out.print("RG: " + this.getRg() + "\n");
		System.out.print("CPF: " + this.getCpf() + "\n");
		System.out.print("DATA NASCIMENTO: " + this.getDataNascimento() + "\n");
		System.out.print("PROFISSÃO: " + this.getProfissao()  +"\n");
		System.out.print("RENDA: " + this.getRenda() + "\n");
		System.out.print("ESTADO CIVIL: " + this.getEstadoCivil() + "\n");
		System.out.print("NOME CONJUGE: " + this.getNomeConjuge() + "\n");
		System.out.print("NOME DA MAÊ: " + this.getNomeMae() + "\n\n");
	}
}



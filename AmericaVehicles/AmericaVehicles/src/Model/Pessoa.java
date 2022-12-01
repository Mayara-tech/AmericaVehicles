package Model;

import java.util.Date;

public abstract class Pessoa {

// Atributos 
	
	private String nome;
	private int rg;
	private int cpf;
	private Date dataNascimento;
	
// Metodo construtor (Cadastrar)
	
	public Pessoa(String nome, int rg, int cpf, Date dataNascimento) {
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
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
// Metodos Deletar e Editar
	
	public void deletar () {
		
	}
	public void editar () {
		
	}
}


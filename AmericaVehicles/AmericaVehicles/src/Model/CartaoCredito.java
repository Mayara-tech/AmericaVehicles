package Model;

import java.util.Date;

public class CartaoCredito {
		
// atributos 
	private int numCartao;
	private Date dataValidade;
	private int cvv;

// Metodo construtor (Cadastrar Cartão de credito)
	
	public CartaoCredito(int numCartao, Date dataValidade, int cvv) {
		super();
		this.numCartao = numCartao;
		this.dataValidade = dataValidade;
		this.cvv = cvv;
	}
	
// Metodos Acessores (gets e sets)
		
	public int getNumCartao() {
		return numCartao;
	}
	
	public void setNumCartao(int numCartao) {
		this.numCartao = numCartao;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public int getCvv() {
		return cvv;
	}
	
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

// Metodos Deletar e Editar
		
	public void deletarPagamento () {
		
	}
	public void editarPagamento () {
				
	}

// Metodos Simulador e Comprar () {
	
	public void simularcompraCartao () {
		
	}
	public void comprarCartao ( ) {
		
	}

}

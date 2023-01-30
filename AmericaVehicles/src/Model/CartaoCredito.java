package Model;

import java.util.Date;

public class CartaoCredito {
	
	/**
	 * Classe CartaoCredito contem os atributos referentes a forma de pagamento com Cartao de Credito de um veiculo.
	 * @author Mayara Alves de Oliveira
	 * @since 2023
	 * @version 1.0
	 */
		
// atributos 
	private int numCartao;
	private Date dataValidade;
	private int cvv;
	
	/**
	 * Construtor da classe CartaoCredito.
	 * @param numCartao
	 * @param dataValidade
	 * @param cvv
	 */

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


}

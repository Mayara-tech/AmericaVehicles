package Model;

public class FormaPagamento {
	
	/**
	 * Classe FormaPagamento deve conter os atributos que serao associados ao CartaoCredito, CartaCredito, finacimento .
	 * @author Mayara Alves de Oliveira
	 * @since 2023
	 * @version 2.0
	 */

// Atributos
	
	private String tipoPagamento;
	private int qndParcelas;
	
	/**
	 * Construtor da classe FormaPagamento.
	 * @param tipoPagamento
	 * @param qndParcelas
	 */

// Metodo Construtor (Cadastrar Forma de Pagamento)
	
	public FormaPagamento(String tipoPagamento, int qndParcelas) {
		super();
		this.tipoPagamento = tipoPagamento;
		this.qndParcelas = qndParcelas;
	}

// Metodos Acessores (gets e sets)
	
	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public int getQndParcelas() {
		return qndParcelas;
	}

	public void setQndParcelas(int qndParcelas) {
		this.qndParcelas = qndParcelas;
	}
	
}

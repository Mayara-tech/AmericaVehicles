package Model;

public class FormaPagamento {

// Atributos
	
	private String tipoPagamento;
	private int qndParcelas;

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
	
// Metodos Deletar e Editar
	
	public void deletarPagamento () {
		
	}
	public void editarPagamento () {
				
	}

}

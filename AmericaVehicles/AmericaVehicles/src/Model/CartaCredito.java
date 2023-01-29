package Model;

public class CartaCredito {
	
// Atributos
	
	private String banco;
	private int numContemplacao;
	private Float valorCarta;


// Metodo construtor (Cadastrar carta de credito)

	public CartaCredito(String banco, int numContemplacao, Float valorCarta) {
		super();
		this.banco = banco;
		this.numContemplacao = numContemplacao;
		this.valorCarta = valorCarta;
	}

// Metodos Acessores (gets e sets)
	
	public String getBanco() {
		return banco;
	}


	public void setBanco(String banco) {
		this.banco = banco;
	}


	public int getNumContemplacao() {
		return numContemplacao;
	}


	public void setNumContemplacao(int numContemplacao) {
		this.numContemplacao = numContemplacao;
	}


	public Float getValorCarta() {
		return valorCarta;
	}


	public void setValorCarta(Float valorCarta) {
		this.valorCarta = valorCarta;
	}

// Metodos Deletar e Editar
	
	public void deletarPagamento () {
			
	}
	public void editarPagamento () {
				
	}
}

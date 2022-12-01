package Model;

public class Financiamento {
	
// Atributos 
	
	private String banco;
	private Float valorEntrada;
	private Float valorFinanciado;
	private float taxaJuros;

// Metodo Construtor (Cadastrar Financiamento)
	
	public Financiamento(String banco, Float valorEntrada, Float valorFinanciado, float taxaJuros) {
		super();
		this.banco = banco;
		this.valorEntrada = valorEntrada;
		this.valorFinanciado = valorFinanciado;
		this.taxaJuros = taxaJuros;
	}

// Metodos Acessores (gest e sets)
	
	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public Float getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(Float valorEntrada) {
		this.valorEntrada = valorEntrada;
	}

	public Float getValorFinanciado() {
		return valorFinanciado;
	}

	public void setValorFinanciado(Float valorFinanciado) {
		this.valorFinanciado = valorFinanciado;
	}

	public float getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(float taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
// Metodos Deletar e Editar
	
	public void deletarPagamento () {
		
	}
	public void editarPagamento () {
				
	}

// Metodos Simulador e Comprar () {
			
	public void simularcompraFinanciamento () {
			
	}
	public void comprarFinanciamento ( ) {
		
	}

}

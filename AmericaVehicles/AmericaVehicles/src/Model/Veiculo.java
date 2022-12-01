package Model;

public abstract class Veiculo {

// Atributos 
	
	private String tipoVeiculo;
	private String marca;
	private String modelo;
	private int ano;
	private Float valor;
	private String condicao;
	
// Metodo construtor (Cadastrar Veiculo)
	
	public Veiculo(String tipoVeiculo, String marca, String modelo, int ano, Float valor, String condicao) {
		super();
		this.tipoVeiculo = tipoVeiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
		this.condicao = condicao;
	}
// Metodos Acessores (gets e sets)

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}
	
// Metodos editar e deletar 
	
	public void deletarVeiculo () {
		
	}
	public void editarVeiculo () {
			
	}

// Metodos de filtragem
	
	public void filtrarMarca () {
		
	}
	public void filtrarModelo() {
		
	}
	public void filtrarAno() {
		
	}
	public void filtrarCondicao() {
		
	}
}

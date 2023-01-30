package Model;

public class Caminhao extends Veiculo {

	/**
	 * Classe Caminhao herda da Classe Veiculo e adicionar os atributos especificos de caminhao.
	 * @author Mayara Alves de Oliveira
	 * @since 2023
	 * @version 1.0
	 */
	
// Atributos 

	private String cor;
	private int quilometragem;
	private String combustivel;
	private String tipoCaminhao;
	
	/**
	 * Construtor da classe Caminhao.
	 * @param tipoVeiculo
	 * @param marca
	 * @param modelo
	 * @param ano
	 * @param valor
	 * @param condicao
	 * @param cor
	 * @param quilometragem
	 * @param tipoCaminhao
	 */
	
// Metodo construtor (cadastrar Caminhão)
	
	public Caminhao(String tipoVeiculo, String marca, String modelo, int ano, Float valor, String condicao, String cor,
			int quilometragem, String combustivel, String tipoCaminhao) {
		super(tipoVeiculo, marca, modelo, ano, valor, condicao);
		this.cor = cor;
		this.quilometragem = quilometragem;
		this.combustivel = combustivel;
		this.tipoCaminhao = tipoCaminhao;
	}

// Metodos Acessores (gets e sets)

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getTipoCaminhao() {
		return tipoCaminhao;
	}

	public void setTipoCaminhao(String tipoCaminhao) {
		this.tipoCaminhao = tipoCaminhao;
	}


}

package Model;
import Model.*;

public class Carro extends Veiculo {
	
	/**
	 * Classe Carro herda da Classe Veiculo e adicionar os atributos especificos de carro.
	 * @author Mayara Alves de Oliveira
	 * @since 2023
	 * @version 1.0
	 */

	// Atributos

	private String descricao;
	private String cor;
	private String cambio;
	private int quilometragem;
	
	/**
	 * Construtor da classe Carro.
	 * @param tipoVeiculo
	 * @param marca
	 * @param modelo
	 * @param ano
	 * @param valor
	 * @param condicao
	 * @param descricao
	 * @param cor
	 * @param cambio
	 * @param quilometragem
	 */
	// metodo construtor (Cadastrar Carro) {

	public Carro(String tipoVeiculo, String marca, String modelo, int ano, Float valor, String condicao,
			String descricao, String cor, String cambio, int quilometragem) {
		super(tipoVeiculo, marca, modelo, ano, valor, condicao);
		this.descricao = descricao;
		this.cor = cor;
		this.cambio = cambio;
		this.quilometragem = quilometragem;
	}

	// Sobrecarga Metodo toString
	
	public String toString() {
		return getTipoVeiculo() + getMarca() ;
	}

	// metodos acessores (gets e sets)

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}

}

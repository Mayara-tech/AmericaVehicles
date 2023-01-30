package Model;

public class Moto extends Veiculo{

	/**
	 * Classe Moto herda da Classe Veiculo e adicionar os atributos especificos de moto.
	 * @author Mayara Alves de Oliveira
	 * @since 2023
	 * @version 1.0
	 */

// Atributos

	private String descricao;
	private String tipoMoto;
	private int Cilindrada;

	/**
	 * Construtor da classe Moto.
	 * @param tipoVeiculo
	 * @param marca
	 * @param modelo
	 * @param ano
	 * @param valor
	 * @param condicao
	 * @param descricao
	 * @param tipoMoto
	 * @param cilindrada
	 */
	
	// Metodo construtor (Cadastrar Moto) 
	
	public Moto(String tipoVeiculo, String marca, String modelo, int ano, Float valor, String condicao, String descricao,
			String tipoMoto, int cilindrada) {
		super(tipoVeiculo, marca, modelo, ano, valor, condicao);
		this.descricao = descricao;
		this.tipoMoto = tipoMoto;
		this.Cilindrada = cilindrada;
	}

// Metodos Acessores (gets e sets) 

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipoMoto() {
		return tipoMoto;
	}

	public void setTipoMoto(String tipoMoto) {
		this.tipoMoto = tipoMoto;
	}

	public int getCilindrada() {
		return Cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		Cilindrada = cilindrada;
	}

}

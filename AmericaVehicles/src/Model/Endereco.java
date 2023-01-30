package Model;

public class Endereco {
	/**
	 * Classe Endereco deve conter os atributos que serao associados ao Cliente e Vendedor .
	 * @author Mayara Alves de Oliveira
	 * @since 2023
	 * @version 2.0
	 */
	
// Atributos
	private String pais;
	private String estado;
	private String complemento;
	private String cidade;
	private String bairro;
	private int cep;
	
	/**
	 * Construtor da classe Endereco.
	 * @param pais
	 * @param estado
	 * @param complemento
	 * @param cidade
	 * @param bairro
	 * @param cep
	 */

// Metodo Constructor (Cadastrar endere�o)
		
	public Endereco(String pais, String estado, String complemento, String cidade, String bairro, String rua, int lote,
			int cep) {
		super();
		this.pais = pais;
		this.estado = estado;
		this.complemento = complemento;
		this.cidade = cidade;
		this.bairro = bairro;
		this.cep = cep;
		}

//  Metodos Acessores (Gets e Sets)	
		
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
		
}

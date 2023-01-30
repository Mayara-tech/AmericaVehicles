package Model;

public class Telefone {
	
	/**
	 * Classe Telefone deve conter os atributos que serao associados ao Cliente e Vendedor .
	 * @author Mayara Alves de Oliveira
	 * @since 2023
	 * @version 1.0
	 */
	
// Atributos

	private int ddd;
	private int numeroTelefone;

	/**
	 * Construtor da classe Telefone.
	 * @param ddd
	 * @param numeroTelefone
	 */
	
// Metodo Constructor ( Cadastrar telefone)
		
	public Telefone(int ddd, int numeroTelefone) {
		super();
		this.ddd = ddd;
		this.numeroTelefone = numeroTelefone;
	}

//  Metodos Acessores (Gets e Sets)	
		
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

}

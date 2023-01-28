package Model;

public class Telefone {
	
// Atributos

	private int ddd;
	private int numeroTelefone;

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
	
// Metodos deletar e editar 
	
	public void deletarTelefone () {
		
	}
	public void editarTelefone () {
			
	}

}

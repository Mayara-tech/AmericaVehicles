package Model;

public class Moto extends Veiculo{
	
// Atributos
	
	private String descricao;
	private String tipoMoto;
	private int Cilindrada;

// Metodo construtor (Cadastrar Moto) 

public Moto(String tipoVeiculo, String marca, String modelo, int ano, Float valor, String condicao, String descricao,
		String tipoMoto, int cilindrada) {
	super(tipoVeiculo, marca, modelo, ano, valor, condicao);
	this.descricao = descricao;
	this.tipoMoto = tipoMoto;
	Cilindrada = cilindrada;
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
	
// Metodos editar e deletar 
	
	public void deletarVeiculo () {
			
	}
	public void editarVeiculo () {
				
	}

// Metodos de filtragem
	
	public void filtrarTipoMoto () {
		
	}
	public void filtrarCilindrada () {
		
	}
}

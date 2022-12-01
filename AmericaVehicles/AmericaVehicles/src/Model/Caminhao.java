package Model;

public class Caminhao extends Veiculo {
	
// Atributos 
	
	private String cor;
	private int quilometragem;
	private String combustivel;
	private String tipoCaminhao;
	
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
	
// Metodos editar e deletar 

	public void deletarVeiculo () {
			
	}
	public void editarVeiculo () {
				
	}
	
// Metodos de filtragem () {
	
	public void filtrarCombustivel () {
		
	}
	public void filtrarTipoCaminhao () {
		
	}
}

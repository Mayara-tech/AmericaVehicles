package Model;

import java.util.ArrayList;
import java.util.List;

public class Dado {

	/**
	 * Classe Dado simula um banco de dados.
	 * @author Mayara Alves de Oliveira
	 * @since 2023
	 * @version 1.0
	 */
	
	// criando ArrayList dos veiculos 
	
	private List<Carro> carro = new ArrayList<Carro>();
	private List<Moto> moto = new ArrayList<Moto>();
	private List<Caminhao> caminhao = new ArrayList<Caminhao>();

	// inserindo banco de dados de dados pre cadastrados 
	public void cadastrosProntos() {
		
		// Carros
		carro.add(new Carro("Carro","FIAT","MOBI EASY", 2018, 37.800f, "Seminovo", 
				"Com trava eletrica","Vermelho", "manual", 34000));
		carro.add(new Carro("Carro","VOLKSWAGEN","GOL TRENOLINE", 2017, 44.990f, "Seminovo",
				"IPVA 2023 pago","Branco", "manual", 88377));
		carro.add(new Carro("Carro","CHEVROLET","S10 PICK-UP", 2013, 49.900f, "Seminovo",
				"Acessorios Inclusos","Prata", "manual", 147800));
		carro.add(new Carro("Carro","FIAT","STRADA FREEDOM", 2023, 104.900f, "Novo",
				"Com farol para neblina","Vermelho", "manual", 0));
		carro.add(new Carro("Carro","HONDA","CIVIC EXL", 2020, 118.900f, "Seminovo",
				"Bancos de couro","Azul", "automatico", 59000));
		
		// Motos
		moto.add(new Moto("Moto", "HONDA", "CB HORNET", 2018, 21.900f, "Seminovo", 
				"Moto sem nenhum grave", "Esportiva", 600));
		moto.add(new Moto("Moto", "HONDA", "BROS 160", 2019, 17.800f, "Seminovo", 
				"Dut em branco", "Trail", 160));
		moto.add(new Moto("Moto", "HONDA", "CG TITAN", 2019, 9.800f, "Seminovo", 
				"Sem multas", "Street", 160));
		moto.add(new Moto("Moto", "SUZUKI", "GSX 1100", 2020, 64.999f, "Seminovo", 
				"Unico dono", "Esportiva", 1000));
		moto.add(new Moto("Moto", "HONDA", "POP 100", 2015, 7.999f, "Seminovo", 
				"Toda original", "Street", 125));
		
		// Caminhao
		caminhao.add(new Caminhao("Caminhao", "MERCEDES BENZ","1518" ,1988, 95000f, "Seminovo",
				"azul", 118540,"Diesel", "Com caçamba"));
		caminhao.add(new Caminhao("Caminhao", "MERCEDES BENZ","ACELLO 1016" ,2018, 30000f, "Seminovo",
				"branco", 245000,"Diesel", "Sem caçamba"));
		caminhao.add(new Caminhao("Caminhao", "VOLVO","GLOBE TROTER" ,2013, 530000f, "Seminovo",
				"branco", 1000000,"Diesel", "Carreta completa equipada"));
		caminhao.add(new Caminhao("Caminhao", "SCANIA","360" ,2002, 150000f, "Seminovo",
				"vermelho", 990000,"Diesel", "Sem carreta"));
		caminhao.add(new Caminhao("Caminhao", "MERCEDES BENZ","ACTROS" ,2021, 300000f, "Seminovo",
				"prata", 245000,"Diesel", "Sem caçamba"));
	}
	public List<Carro> getCarro() {
		return carro;
	}
	public List<Moto> getMoto() {
		return moto;
	}
	public List<Caminhao> getCaminhao() {
		return caminhao;
	}

	public void setCarro(List<Carro> Carro) {
		this.carro = Carro;
	}
	public void setMoto(List<Moto> Moto) {
		this.moto = Moto;
	}
	public void setCaminhao(List<Caminhao> Caminhao) {
		this.caminhao = Caminhao;
	}
	/**
	 * cadastrarCarro - Armazena os dados de Carro na lista de carros.
	 * @param m
	 * @param posicao
	 * @param d
	 */
	public void cadastrarCarro(Carro m, int posicao, Dado d) {
		if(posicao == d.getCarro().size()) {
			this.carro.add(m);
		}else {
			this.carro.set(posicao, m);
		}
	}
	/**
	 * cadastrarMoto - Armazena os dados de Moto na lista de motos.
	 * @param m
	 * @param posicao
	 * @param d
	 */
	public void cadastrarMoto(Moto m, int posicao, Dado d) {
		if(posicao == d.getMoto().size()) {
			this.moto.add(m);
		}else {
			this.moto.set(posicao, m);
		}
	}
	/**
	 * cadastrarCaminhao - Armazena os dados de Caminhao na lista de caminhao.
	 * @param m
	 * @param posicao
	 * @param d
	 */
	public void cadastrarCaminhao(Caminhao m, int posicao, Dado d) {
		if(posicao == d.getCaminhao().size()) {
			this.caminhao.add(m);
		}else {
			this.caminhao.set(posicao, m);
		}
	}
}

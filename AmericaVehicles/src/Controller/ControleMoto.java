package Controller;
import java.util.List;
import Model.Carro;
import Model.Moto;
import Controller.*;


public class ControleMoto {
	/**
	 * Classe ControleMoto faz o controle de todos os dados dos veiculos de Moto.
	 * @author Mayara Alves de Oliveira
	 * @since 2023
	 * @version 1.0
	 */

	public List<Moto> moto;
	/**
	 * Construtor do ControleMoto
	 * Preenche uma lista com todos as motos cadastrados.
	 * @param e
	 */

	public ControleMoto(ControleDados e) {
		moto = e.getMoto();
	}
	/**
	 * Retorna um array com o nome de todos as motos cadastradas.
	 * @return String[]
	 */

	public String[] getListaMoto() {
		String[] listaMoto = new String[moto.size()];
		for(int i = 0; i<moto.size(); i++) {
			listaMoto[i] = moto.get(i).getMarca () + " "+ moto.get(i).getModelo ();
		}
		return listaMoto;
	}

	public String getTipoVeiculo(int i) {
		return moto.get(i).getTipoVeiculo();
	}
	public String getMarca(int i) {
		return moto.get(i).getMarca();
	}
	public String getModelo(int i) {
		return moto.get(i).getModelo();
	}
	public int getAno (int i) {
		return moto.get(i).getAno();
	}
	public java.lang.Float getValor (int i) {
		return moto.get(i).getValor();
	}
	public String getCondicao(int i) {
		return moto.get(i).getCondicao();
	}
	public String getDescricao(int i) {
		return moto.get(i).getDescricao();
	}
	public String getTipoMoto(int i) {
		return moto.get(i).getTipoMoto();
	}
	public int getCilindrada(int i) {
		return moto.get(i).getCilindrada();
	}
	
	
}

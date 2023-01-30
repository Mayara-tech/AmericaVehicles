package Controller;
import java.util.List;

import Model.*;


public class ControleVeiculos {
	
	/**
	 * Classe ControleVeiculo faz o controle de todos os dados dos veiculos de Carro.
	 * @author Mayara Alves de Oliveira
	 * @since 2023
	 * @version 1.0
	 */

	public List<Carro> carro;
	/**
	 * Construtor do ControleVeiculo
	 * Preenche uma lista com todos os Carros cadastrados.
	 * @param d
	 */

	public ControleVeiculos(ControleDados d) {
		carro = d.getCarro();
	}

	/**
	 * Retorna um array com o nome de todos os carros cadastrados.
	 * @return String[]
	 */
	
	public String[] getListaCarro() {
		String[] listaCarro = new String[carro.size()];
		for(int i = 0; i<carro.size(); i++) {
			listaCarro[i] = carro.get(i).getMarca () + " "+ carro.get(i).getModelo();
		}
		return listaCarro;
	}

	public String getTipoVeiculo(int i) {
		return carro.get(i).getTipoVeiculo();
	}
	public String getMarca(int i) {
		return carro.get(i).getMarca();
	}
	public String getModelo(int i) {
		return carro.get(i).getModelo();
	}
	public int getAno (int i) {
		return carro.get(i).getAno();
	}
	public java.lang.Float getValor (int i) {
		return carro.get(i).getValor();
	}
	public String getCondicao(int i) {
		return carro.get(i).getCondicao();
	}
	public String getDescricao(int i) {
		return carro.get(i).getDescricao();
	}
	public String getCor(int i) {
		return carro.get(i).getCor();
	}
	public String getCambio(int i) {
		return carro.get(i).getCambio();
	}
	public int getQuilometragem(int i) {
		return carro.get(i).getQuilometragem();
	}
	
	

}

package Controller;

import java.util.List;

import Model.Caminhao;
import Model.Moto;
import Controller.*;


public class ControleCaminhao {
	public List<Caminhao> caminhao;
	/**
	 * Construtor ControleMedicamento
	 * Preenche uma lista com todos os medicamentos cadastrados.
	 * @param d
	 * @return 
	 * @return 
	 */

	public ControleCaminhao(ControleDados f) {
		caminhao = f.getCaminhao();
	}

	/**
	 * Retorna um array com o nome de todos os medicamento.
	 * @return String[]
	 */

	public String[] getListaCaminhao() {
		String[] listaCaminhao = new String[caminhao.size()];
		for(int i = 0; i<caminhao.size(); i++) {
			listaCaminhao[i] = caminhao.get(i).getMarca () + " "+ caminhao.get(i).getModelo () ;
		}
		return listaCaminhao;
	}

	public String getTipoVeiculo(int i) {
		return caminhao.get(i).getTipoVeiculo();
	}
	public String getMarca(int i) {
		return caminhao.get(i).getMarca();
	}
	public String getModelo(int i) {
		return caminhao.get(i).getModelo();
	}
	public int getAno (int i) {
		return caminhao.get(i).getAno();
	}
	public java.lang.Float getValor (int i) {
		return caminhao.get(i).getValor();
	}
	public String getCondicao(int i) {
		return caminhao.get(i).getCondicao();
	}
	public String getCor(int i) {
		return caminhao.get(i).getCor();
	}
	public int getQuilometragem(int i) {
		return caminhao.get(i).getQuilometragem();
	}
	public String getCombustivel(int i) {
		return caminhao.get(i).getCombustivel();
	}
	public String getTipoCaminhao(int i) {
		return caminhao.get(i).getTipoCaminhao();
	}



}

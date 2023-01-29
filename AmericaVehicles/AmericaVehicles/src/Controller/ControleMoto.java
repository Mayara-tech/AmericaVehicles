package Controller;
import java.util.List;
import Model.Carro;
import Model.Moto;
import Controller.*;


public class ControleMoto {

	public List<Moto> moto;
	/**
	 * Construtor ControleMedicamento
	 * Preenche uma lista com todos os medicamentos cadastrados.
	 * @param d
	 * @return 
	 * @return 
	 */

	public ControleMoto(ControleDados e) {
		moto = e.getMoto();
	}

	/**
	 * Retorna um array com o nome de todos os medicamento.
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

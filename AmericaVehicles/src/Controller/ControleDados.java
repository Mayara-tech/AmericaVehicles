package Controller;
import java.util.*;
import Model.*;

public class ControleDados {
	/**
	 * Classe ControleDados faz o controle de todos os dados cadastrados.
	 * @author Mayara Alves de Oliveira
	 * @since 2023
	 * @version 1.0
	 */

	private Dado d = new Dado();
	private Dado e = new Dado();
	private Dado f = new Dado();

	/**
	 * Construtor ControleDados
	 * Cadastra os dados criados na Classe Dado.
	 */
	public ControleDados() {
		d.cadastrosProntos();
		e.cadastrosProntos();
		f.cadastrosProntos();
	}

	public Dado getD() {
		return d;
	}

	public void setD(Dado d) {
		this.d = d;
	}

	public Dado getE() {
		return e;
	}
	public void setE(Dado e) {
		this.e = e;
	}
	public Dado getF() {
		return f;
	}
	public void setF(Dado f) {
		this.f = f;
	}
	/**
	 * Retorna a lista de Carros cadastrados.
	 * @return List<Carro>
	 */
	public List<Carro> getCarro() {
		return d.getCarro();
	}
	/**
	 * Retorna a lista de Motos cadastrados.
	 * @return List<Moto>
	 */
	public List<Moto> getMoto() {
		return d.getMoto();
	}
	/**
	 * Retorna a lista de Caminhoes cadastrados.
	 * @return List<Caminhao>
	 */
	public List<Caminhao> getCaminhao() {
		return d.getCaminhao();

	}

}

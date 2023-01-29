package Controller;
import java.util.*;
import Model.*;

public class ControleDados {
	private Dado d = new Dado();
	private Dado e = new Dado();
	private Dado f = new Dado();
	
	/**
	 * Construtor ControleDados
	 * Cadastra os dados criados na Classe Dados.
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

	public List<Carro> getCarro() {
		return d.getCarro();
	}
	public List<Moto> getMoto() {
		return d.getMoto();
		
	}
	public List<Caminhao> getCaminhao() {
		return d.getCaminhao();
		
	}

	
	
			}

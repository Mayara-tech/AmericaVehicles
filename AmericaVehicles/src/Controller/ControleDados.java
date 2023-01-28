package Controller;
import java.util.*;
import Model.*;

public class ControleDados {
	private static Cliente[] clientes = new Cliente[50];
	private Vendedor[] vendedores = new Vendedor[50];
	private Carro[] carros = new Carro[50];
	private Moto[] motos = new Moto[50];
	private Caminhao[] caminhoes = new Caminhao[50];
	private static Telefone[] telefones = new Telefone[50];
	private static Endereco[] enderecos = new Endereco[50];
	
	
	public static Cliente[] getClientes() {
		return clientes;
	}
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
	public Vendedor[] getVendedores() {
		return vendedores;
	}
	public void setVendedores(Vendedor[] vendedores) {
		this.vendedores = vendedores;
	}
	public Carro[] getCarros() {
		return carros;
	}
	public void setCarros(Carro[] carros) {
		this.carros = carros;
	}
	public Moto[] getMotos() {
		return motos;
	}
	public void setMotos(Moto[] motos) {
		this.motos = motos;
	}
	public Caminhao[] getCaminhoes() {
		return caminhoes;
	}
	public void setCaminhoes(Caminhao[] caminhoes) {
		this.caminhoes = caminhoes;
	}
	public static Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	public static Endereco[] getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(Endereco[] enderecos) {
		this.enderecos = enderecos;
	}
	
	
	
			}

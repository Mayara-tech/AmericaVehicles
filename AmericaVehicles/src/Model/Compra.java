package Model;

public class Compra {

// Atributos
	private int dataCompra;
	private int numeroPedido;
	private String recibo;


// Metodo Construtor ( Cadastrar Compra )
	
	public Compra(int dataCompra, int numeroPedido, String recibo) {
		super();
		this.dataCompra = dataCompra;
		this.numeroPedido = numeroPedido;
		this.recibo = recibo;
	}

// Metodos Acessores (gets e sets)

	public int getDataCompra() {
		return dataCompra;
	}


	public void setDataCompra(int dataCompra) {
		this.dataCompra = dataCompra;
	}


	public int getNumeroPedido() {
		return numeroPedido;
	}


	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}


	public String getRecibo() {
		return recibo;
	}


	public void setRecibo(String recibo) {
		this.recibo = recibo;
	}
	
	
}
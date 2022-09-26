package model;

public class Pacote {

	protected int idPacote;
	protected String data;
	protected String destino;
	protected String tipo;
	protected double valor;
	protected Compra idCompra;
	
	
	public Pacote(int idPacote, String data, String destino, String tipo, double valor, Compra idCompra) {
		super();
		this.idPacote = idPacote;
		this.data = data;
		this.destino = destino;
		this.tipo = tipo;
		this.valor = valor;
		this.idCompra = idCompra;
	}
	
	public Pacote () {
		
	}

	public int getIdPacote() {
		return idPacote;
	}

	public void setIdPacote(int idPacote) {
		this.idPacote = idPacote;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Compra getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Compra idCompra) {
		this.idCompra = idCompra;
	}
	
	
	
	
	
	
	
}

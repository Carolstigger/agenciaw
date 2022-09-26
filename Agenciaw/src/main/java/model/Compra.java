package model;

public class Compra {
	
	protected int idCompra;
	protected String data;
	protected double valor;
	protected String formaDePagamento;
	protected Cliente idCliente;
	protected Vendedor idVendedor;
	
	public Compra(int idCompra, String data, double valor, String formaDePagamento, Cliente idCliente,
			Vendedor idVendedor) {
		super();
		this.idCompra = idCompra;
		this.data = data;
		this.valor = valor;
		this.formaDePagamento = formaDePagamento;
		this.idCliente = idCliente;
		this.idVendedor = idVendedor;
	}
	
	public Compra () {
		
	}

	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public Vendedor getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Vendedor idVendedor) {
		this.idVendedor = idVendedor;
	}
	
	
	
}

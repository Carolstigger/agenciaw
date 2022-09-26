package model;

public class Vendedor {

	protected int idVendedor;
	protected String nome;
	protected String cpf;
	
	public Vendedor(int idVendedor, String nome, String cpf) {
		super();
		this.idVendedor = idVendedor;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Vendedor() {
		
	}

	public int getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void realizarVenda() {
		
	}
	
	

	
}

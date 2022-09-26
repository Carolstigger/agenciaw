package model;

public class Endereco {
	
	protected int idEndereco;
	protected String rua;
	protected String bairro;
	protected String cidade;
	protected int numero;
	protected String cep;
	protected Cliente idCliente;
	
	
	public Endereco(int idEndereco, String rua, String bairro, String cidade, int numero, String cep,
			Cliente idCliente) {
		super();
		this.idEndereco = idEndereco;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.numero = numero;
		this.cep = cep;
		this.idCliente = idCliente;
	}
	
	public Endereco() {
		
		
	}

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}
	
	
	

}

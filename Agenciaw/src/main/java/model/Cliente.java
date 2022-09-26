package model;

public class Cliente {
	
	protected int idCliente;
	protected String nome;
	protected String telefone;
	protected String cpf;
	protected int nascimento;
	protected Endereco endereco;
	
	
	public Cliente(int idCliente, String nome, String telefone, String cpf, int nascimento, Endereco endereco) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.endereco = endereco;
	}
	
	public Cliente () {
		
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNascimento() {
		return nascimento;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void alterarNome() {
		
	}
	public void realizarCompra() {
		
	}
	
	
	
	
	
	

}

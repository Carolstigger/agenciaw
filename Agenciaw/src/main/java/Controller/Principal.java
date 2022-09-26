package Controller;

import java.util.Scanner;

import DAO.ClienteDAO;
import DAO.CompraDAO;
import DAO.EnderecoDAO;
import DAO.PacoteDAO;
import DAO.VendedorDAO;
import model.Cliente;
import model.Compra;
import model.Endereco;
import model.Pacote;
import model.Vendedor;

public class Principal {

	public static void main(String[] args) {
		
		ClienteDAO clienteDAO = new ClienteDAO();
		VendedorDAO vendedorDAO = new VendedorDAO();
		CompraDAO compraDAO = new CompraDAO();
		PacoteDAO pacoteDAO = new PacoteDAO();
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		
		
		Scanner entrada = new Scanner(System.in);
		int opcao1=0;
		int opcao=0;

		do {

			System.out.println("===== REGISTROS =====");
			System.out.println("1 - Registros Clientes");
			System.out.println("2 - Registros Vendedores");
			System.out.println("3 - Registros Compras");
			System.out.println("4 - Registros Pacotes");
			System.out.println("5 - Registros Endereços");
			System.out.println("6 - Sair");
			System.out.println("Selecione uma opção");
			System.out.println("====================");

			opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:
				//CLIENTE
				
				do {

					System.out.println("===== CADASTRO =====");
					System.out.println("1 - Cadastro de Cliente");
					System.out.println("2 - Excluir Cliente");
					System.out.println("3 - Atualizar Cliente");
					System.out.println("4 - Mostrar Clientes");
					System.out.println("5 - Buscar Cliente por ID");
					System.out.println("6 - Voltar ao menu anterior");
					System.out.println("Selecione uma opção");
					System.out.println("====================");

					opcao = entrada.nextInt();

					switch (opcao) {
					case 1:
						System.out.println("Digite o nome");
						String nome = entrada.next();
						System.out.println("Digite o Telefone");
						String cpf = entrada.next();
						System.out.println("Digite o CPF");
						String telefone = entrada.next();
						System.out.println("Digite o ano de nascimento");
						int nascimento = entrada.nextInt();

						Cliente cliente = new Cliente();
						
						cliente.setNome(nome);
						cliente.setTelefone(telefone);
						cliente.setCpf(cpf);
						cliente.setNascimento(nascimento);
					
						clienteDAO.save(cliente);
						break;

					case 2:
						System.out.println("Digite o código");
						int codigo = entrada.nextInt();

						clienteDAO.removeById(codigo);
						break;

					case 3:
						System.out.println("Digite o código");
						codigo = entrada.nextInt();
						System.out.println("Digite o novo nome");
						String novoNome = entrada.next();
						System.out.println("Digite o novo telefone");
						String novoTelefone = entrada.next();
						System.out.println("Digite o novo CPF");
						String novoCpf = entrada.next();
						System.out.println("Digite o novo nascimento");
						int novoNascimento = entrada.nextInt();

						Cliente cliente1 = new Cliente();
						
						cliente1.setIdCliente(codigo);
						cliente1.setNome(novoNome);
						cliente1.setTelefone(novoTelefone);
						cliente1.setCpf(novoCpf);
						cliente1.setNascimento(novoNascimento);

						clienteDAO.update(cliente1);
						break;

					case 4:

						for (Cliente c : clienteDAO.getClientes()) {

							System.out.println("NOME: " + c.getNome());
							System.out.println("TELEFONE: " + c.getTelefone());
							System.out.println("CPF: " + c.getCpf());
							System.out.println("NASCIMENTO: " + c.getNascimento());
							System.out.println("----------------------------------- ");
						}
						break;

					case 5:

						System.out.println("Digite o código");
						int idCliente = entrada.nextInt();

						Cliente c = clienteDAO.getClienteById(idCliente);

						System.out.println("NOME: " + c.getNome());
						System.out.println("TELEFONE: " + c.getTelefone());
						System.out.println("CPF: " + c.getCpf());
						System.out.println("NASCIMENTO: " + c.getNascimento());
						System.out.println("----------------------------------- ");
						break;

					case 6:
						System.out.println("Voltando Menu");
						break;

					}

				} while (opcao != 6);
				break;

			case 2:
				
				//vendedor
				do {

					System.out.println("===== CADASTRO =====");
					System.out.println("1 - Cadastro de Vendedor");
					System.out.println("2 - Excluir vendedor");
					System.out.println("3 - Atualizar vendedor");
					System.out.println("4 - Mostrar vendedores");
					System.out.println("5 - Buscar vendedor por ID");
					System.out.println("6 - Voltar ao menu anterior");
					System.out.println("Selecione uma opção");
					System.out.println("====================");

					opcao = entrada.nextInt();

					switch (opcao) {
					case 1:
						System.out.println("Digite o nome");
						String nome = entrada.next();
						System.out.println("Digite o CPF");
						String cpf = entrada.next();

						Vendedor vendedor = new Vendedor();
						vendedor.setNome(nome);
						vendedor.setCpf(cpf);

						vendedorDAO.save(vendedor);
						break;

					case 2:
						System.out.println("Digite o código");
						int codigo = entrada.nextInt();

						vendedorDAO.removeById(codigo);
						break;

					case 3:
						System.out.println("Digite o código");
						codigo = entrada.nextInt();
						System.out.println("Digite o novo nome");
						String novoNome = entrada.next();
						System.out.println("Digite o novo CPF");
						String novoCpf = entrada.next();

						Vendedor vendedor1 = new Vendedor();
						vendedor1.setIdVendedor(codigo);
						vendedor1.setNome(novoNome);
						vendedor1.setCpf(novoCpf);

						vendedorDAO.update(vendedor1);
						break;

					case 4:

						for (Vendedor c : vendedorDAO.getVendedores()) {

							System.out.println("NOME: " + c.getNome());
							System.out.println("CPF: " + c.getCpf());
							System.out.println("----------------------------------- ");
						}
						break;

					case 5:

						System.out.println("Digite o código");
						int idVendedor = entrada.nextInt();

						Vendedor c = vendedorDAO.getVendedorById(idVendedor);

						System.out.println("NOME: " + c.getNome());
						System.out.println("CPF: " + c.getCpf());
						System.out.println("----------------------------------- ");
						break;

					case 6:
						System.out.println("Voltando Menu");
						break;

					}

				} while (opcao != 6);
				break;

			case 3:
				//COMPRAS
				do {

					System.out.println("===== CADASTRO =====");
					System.out.println("1 - Cadastro de Compra");
					System.out.println("2 - Excluir compra");
					System.out.println("3 - Atualizar compra");
					System.out.println("4 - Mostrar compras");
					System.out.println("5 - Buscar compra por ID");
					System.out.println("6 - Voltar ao menu anterior");
					System.out.println("Selecione uma opção");
					System.out.println("====================");

					opcao = entrada.nextInt();

					switch (opcao) {
					case 1:
						System.out.println("Digite a data");
						String data = entrada.next();
						System.out.println("Digite o valor");
						Double valor = entrada.nextDouble();
						System.out.println("Digite a forma de pagamento");
						String formaDePagamento = entrada.next();
						
						Compra compra = new Compra();
						compra.setData(data);
						compra.setValor(valor);
						compra.setFormaDePagamento(formaDePagamento);
						
						compraDAO.save(compra);
						break;

					case 2:
						System.out.println("Digite o código");
						int codigo = entrada.nextInt();

						compraDAO.removeById(codigo);
						break;

					case 3:
						System.out.println("Digite o código");
						codigo = entrada.nextInt();
						System.out.println("Digite o nova data");
						String novaData = entrada.next();
						System.out.println("Digite o novo valor");
						Double novoValor = entrada.nextDouble();
						System.out.println("Digite a nova forma de pagamento");
						String novaFormaDePagamento = entrada.next();
						
						Compra compra1 = new Compra();
						compra1.setIdCompra(codigo);
						compra1.setData(novaData);
						compra1.setValor(novoValor);
						compra1.setFormaDePagamento(novaFormaDePagamento);

						compraDAO.update(compra1);
						break;

					case 4:

						for (Compra c : compraDAO.getCompras()) {

							System.out.println("DATA: " + c.getData());
							System.out.println("VALOR: " + c.getValor());
							System.out.println("FORMA DE PAGAMENTO: " + c.getFormaDePagamento());
							System.out.println("----------------------------------- ");
						}
						break;

					case 5:

						System.out.println("Digite o código");
						int idCompra = entrada.nextInt();

						Compra c = compraDAO.getCompraById(idCompra);

						System.out.println("DATA: " + c.getData());
						System.out.println("VALOR: " + c.getValor());
						System.out.println("FORMA DE PAGAMENTO: " + c.getFormaDePagamento());
						System.out.println("----------------------------------- ");
						break;

					case 6:
						System.out.println("Retornando menu");
						break;

					}

				} while (opcao != 6);
				break;

			case 4:
				//PACOTES
				do {

					System.out.println("===== CADASTRO =====");
					System.out.println("1 - Cadastro de Pacote");
					System.out.println("2 - Excluir pacote");
					System.out.println("3 - Atualizar pacote");
					System.out.println("4 - Mostrar pacote");
					System.out.println("5 - Buscar pacote por ID");
					System.out.println("6 - retornar ao menu anterior");
					System.out.println("Selecione uma opção");
					System.out.println("====================");

					opcao = entrada.nextInt();

					switch (opcao) {
					case 1:
						System.out.println("Digite o data");
						String data = entrada.next();
						System.out.println("Digite o destino");
						String destino = entrada.next();
						System.out.println("Digite o tipo");
						String tipo = entrada.next();
						System.out.println("Digite o valor");
						double valor = entrada.nextDouble();
						Pacote pacote = new Pacote();
						
						pacote.setData(data);
						pacote.setDestino(destino);
						pacote.setTipo(tipo);
						pacote.setValor(valor);

						pacoteDAO.save(pacote);
						break;

					case 2:
						System.out.println("Digite o código");
						int codigo = entrada.nextInt();

						pacoteDAO.removeById(codigo);
						break;

					case 3:
						System.out.println("Digite o código");
						codigo = entrada.nextInt();
						System.out.println("Digite a nova data");
						String novaData = entrada.next();
						System.out.println("Digite o novo destino");
						String novoDestino = entrada.next();
						System.out.println("Digite o novo tipo");
						String novoTipo = entrada.next();
						System.out.println("Digite o novo valor");
						double novoValor = entrada.nextDouble();

						Pacote pacote1 = new Pacote();
						
						pacote1.setIdPacote(codigo);
						pacote1.setData(novaData);
						pacote1.setDestino(novoDestino);
						pacote1.setTipo(novoTipo);
						pacote1.setValor(novoValor);

						pacoteDAO.update(pacote1);
						break;

					case 4:

						for (Pacote c : pacoteDAO.getPacotes()) {

							System.out.println("DATA: " + c.getData());
							System.out.println("DESTINO: " + c.getDestino());
							System.out.println("TIPO: " + c.getTipo());
							System.out.println("VALOR: " + c.getValor());
							System.out.println("----------------------------------- ");
						}
						break;

					case 5:

						System.out.println("Digite o código");
						int idPacote = entrada.nextInt();

						Pacote c = pacoteDAO.getPacoteById(idPacote);

						System.out.println("DATA: " + c.getData());
						System.out.println("DESTINO: " + c.getDestino());
						System.out.println("TIPO: " + c.getTipo());
						System.out.println("VALOR: " + c.getValor());
						System.out.println("----------------------------------- ");
						break;

					case 6:
						System.out.println("Retornando menu");
						break;

					}

				} while (opcao != 6);
				break;

			case 5:

				//ENDEREÇOS
				do {

					System.out.println("===== CADASTRO =====");
					System.out.println("1 - Cadastro de endereço");
					System.out.println("2 - Excluir endereço");
					System.out.println("3 - Atualizar endereço");
					System.out.println("4 - Mostrar endereços");
					System.out.println("5 - Buscar endereço por ID");
					System.out.println("6 - retornarao menu anterior");
					System.out.println("Selecione uma opção");
					System.out.println("====================");

					opcao = entrada.nextInt();

					switch (opcao) {
					case 1:
						System.out.println("Digite a rua");
						String rua = entrada.next();
						System.out.println("Digite o bairro");
						String bairro = entrada.next();
						System.out.println("Digite a cidade");
						String cidade = entrada.next();
						System.out.println("Digite o numero");
						int numero = entrada.nextInt();
						System.out.println("Digite o CEP");
						String cep = entrada.next();
						
						Endereco endereco = new Endereco();
						
						endereco.setRua(rua);
						endereco.setBairro(bairro);
						endereco.setCidade(cidade);
						endereco.setNumero(numero);
						endereco.setCep(cep);

						enderecoDAO.save(endereco);
						break;

					case 2:
						System.out.println("Digite o código");
						int codigo = entrada.nextInt();

						enderecoDAO.removeById(codigo);
						break;

					case 3:
						System.out.println("Digite o código");
						codigo = entrada.nextInt();
						System.out.println("Digite a nova rua");
						String novaRua = entrada.next();
						System.out.println("Digite o novo bairro");
						String novoBairro = entrada.next();
						System.out.println("Digite a nova cidade");
						String novaCidade = entrada.next();
						System.out.println("Digite o novo numero");
						int novoNumero = entrada.nextInt();
						System.out.println("Digite o novo CEP");
						String novoCep = entrada.next();

						Endereco endereco1 = new Endereco();
						endereco1.setIdEndereco(codigo);
						endereco1.setRua(novaRua);
						endereco1.setBairro(novoBairro);
						endereco1.setCidade(novaCidade);
						endereco1.setNumero(novoNumero);
						endereco1.setCep(novoCep);

						enderecoDAO.update(endereco1);
						break;

					case 4:

						for (Endereco c : enderecoDAO.getEnderecos()) {

							System.out.println("RUA: " + c.getRua());
							System.out.println("NUMERO: " + c.getNumero());
							System.out.println("BAIRRO: " + c.getBairro());
							System.out.println("CIDADE: " + c.getCidade());
							System.out.println("CEP: " + c.getCep());
							System.out.println("----------------------------------- ");
						}
						break;

					case 5:

						System.out.println("Digite o código");
						int idEndereco = entrada.nextInt();

						Endereco c = enderecoDAO.getEnderecoById(idEndereco);

						System.out.println("RUA: " + c.getRua());
						System.out.println("NUMERO: " + c.getNumero());
						System.out.println("BAIRRO: " + c.getBairro());
						System.out.println("CIDADE: " + c.getCidade());
						System.out.println("CEP: " + c.getCep());
						System.out.println("----------------------------------- ");
						break;

					case 6:
						System.out.println("VOLTAR AO MENU ANTERIOR");
						break;

					}

				} while (opcao != 6);
				break;

			case 6:
				
				
				System.out.println("PROGRAMA ENCERRADO");
				break;

			}

		} while (opcao1 != 6);
		entrada.close();
	}
}
			
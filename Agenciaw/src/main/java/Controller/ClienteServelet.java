package Controller;

import java.util.Scanner;

import DAO.ClienteDAO;
import model.Cliente;

public class ClienteServelet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClienteDAO clienteDAO = new ClienteDAO();
		Scanner entrada = new Scanner(System.in);		

		int opcao=0;
		do {

			System.out.println("===== CADASTRO =====");
			System.out.println("1 - Cadastro de Cliente");
			System.out.println("2 - Excluir Cliente");
			System.out.println("3 - Atualizar Cliente");
			System.out.println("4 - Mostrar Clientes");
			System.out.println("5 - Buscar Cliente por ID");
			System.out.println("6 - Encerrar Programa");
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
				System.out.println("ENCERRANDO SISTEMA");
				break;

			}

		} while (opcao != 6);
		entrada.close();
		

	}

}

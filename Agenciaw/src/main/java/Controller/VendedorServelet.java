package Controller;

import java.util.Scanner;

import DAO.VendedorDAO;
import model.Vendedor;

public class VendedorServelet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VendedorDAO vendedorDAO = new VendedorDAO();
		Scanner entrada = new Scanner(System.in);

		int opcao = 0;
		do {

			System.out.println("===== CADASTRO =====");
			System.out.println("1 - Cadastro de Vendedor");
			System.out.println("2 - Excluir vendedor");
			System.out.println("3 - Atualizar vendedor");
			System.out.println("4 - Mostrar vendedores");
			System.out.println("5 - Buscar vendedor por ID");
			System.out.println("6 - Encerrar Programa");
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
				System.out.println("ENCERRANDO SISTEMA");
				break;
			}
		} while (opcao != 6);
		entrada.close();
	}

}

package Controller;

import java.util.Scanner;

import DAO.EnderecoDAO;
import model.Endereco;

public class EnderecoServelet {

	public static void main(String[] args) {

		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Scanner entrada = new Scanner(System.in);		

		int opcao=0;
		// TODO Auto-generated method stub
		do {

			System.out.println("===== CADASTRO =====");
			System.out.println("1 - Cadastro de endereço");
			System.out.println("2 - Excluir endereço");
			System.out.println("3 - Atualizar endereço");
			System.out.println("4 - Mostrar endereços");
			System.out.println("5 - Buscar endereço por ID");
			System.out.println("6 - Encerrar Programa");
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
				System.out.println("ENCERRANDO SISTEMA");
				break;

			}

		} while (opcao != 6);
		entrada.close();
	}

}

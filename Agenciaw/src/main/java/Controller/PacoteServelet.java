package Controller;

import java.util.Scanner;

import DAO.PacoteDAO;
import model.Pacote;

public class PacoteServelet {

	public static void main(String[] args) {
		
		PacoteDAO pacoteDAO = new PacoteDAO();
		Scanner entrada = new Scanner(System.in);		

		int opcao=0;
		// TODO Auto-generated method stub
		do {

			System.out.println("===== CADASTRO =====");
			System.out.println("1 - Cadastro de Pacote");
			System.out.println("2 - Excluir pacote");
			System.out.println("3 - Atualizar pacote");
			System.out.println("4 - Mostrar pacote");
			System.out.println("5 - Buscar pacote por ID");
			System.out.println("6 - Encerrar Programa");
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
				System.out.println("ENCERRANDO SISTEMA");
				break;

			}

		} while (opcao != 6);
		entrada.close();
	}

}

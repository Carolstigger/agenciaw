package Controller;

import java.util.Scanner;

import DAO.CompraDAO;
import model.Compra;

public class CompraServelet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompraDAO compraDAO = new CompraDAO();
		Scanner entrada = new Scanner(System.in);		

		int opcao=0;
		
		do {

			System.out.println("===== CADASTRO =====");
			System.out.println("1 - Cadastro de Compra");
			System.out.println("2 - Excluir compra");
			System.out.println("3 - Atualizar compra");
			System.out.println("4 - Mostrar compras");
			System.out.println("5 - Buscar compra por ID");
			System.out.println("6 - Encerrar Programa");
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
				System.out.println("ENCERRANDO SISTEMA");
				break;
			}		
		

		} while (opcao != 6);
		entrada.close();
		

	}

}

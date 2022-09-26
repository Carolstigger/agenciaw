package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import model.Cliente;


public class ClienteDAO {
	
	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Cliente cliente) {

		String sql = "INSERT INTO Cliente (nome,telefone,cpf,nascimento)" + " VALUES(?,?,?,?)";

		try {
			conn = Conexao.createConnectionToMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, cliente.getNome());
			
			pstm.setString(2, cliente.getTelefone());
			
			pstm.setString(3, cliente.getCpf());
			
			pstm.setInt(4, cliente.getNascimento());

		
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void removeById(int idCliente) {

		String sql = "DELETE FROM Cliente WHERE idCliente = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idCliente);
			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void update(Cliente cliente) {
		String sql = "UPDATE Cliente SET nome = ?,cpf=?, telefone=?, nascimento=?" + "WHERE idCliente = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getTelefone());
			pstm.setString(3, cliente.getCpf());
			pstm.setInt(4, cliente.getNascimento());

			pstm.setInt(5, cliente.getIdCliente());
			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Cliente> getClientes() {

		String sql = "SELECT * FROM Cliente";

		List<Cliente> clientes = new ArrayList<Cliente>();

		ResultSet rset = null;
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				Cliente cliente = new Cliente();
				
				cliente.setIdCliente(rset.getInt("idCliente"));
				
				cliente.setNome(rset.getString("nome"));
			
				cliente.setCpf(rset.getString("cpf"));
				
				cliente.setTelefone(rset.getString("telefone"));
				
				cliente.setNascimento(rset.getInt("nascimento"));
				
				
			
				clientes.add(cliente);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return clientes;
	}

	public Cliente getClienteById(int idCliente) {

		String sql = "SELECT * FROM cliente where idCliente = ?";
		Cliente cliente = new Cliente();

		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idCliente);
			rset = pstm.executeQuery();

			rset.next();
			
			
			cliente.setNome(rset.getString("nome"));
			
			cliente.setCpf(rset.getString("cpf"));
			
			cliente.setTelefone(rset.getString("telefone"));
			
			cliente.setNascimento(rset.getInt("nascimento"));


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cliente;
	}


}

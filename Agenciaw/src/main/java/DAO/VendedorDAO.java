package DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import model.Vendedor;

public class VendedorDAO {

	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Vendedor vendedor) {

		String sql = "INSERT INTO Vendedor(nome,cpf)" + " VALUES(?,?)";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vendedor.getNome());
			pstm.setString(2, vendedor.getCpf());

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

	public void removeById(int idVendedor) {

		String sql = "DELETE FROM Vendedor WHERE idVendedor = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idVendedor);
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

	public void update(Vendedor vendedor) {
		String sql = "UPDATE vendedor SET nome = ?,cpf=?" + "WHERE idVendedor = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vendedor.getNome());
			pstm.setString(2, vendedor.getCpf());
			
			pstm.setInt(3, vendedor.getIdVendedor());
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

	public List<Vendedor> getVendedores() {

		String sql = "SELECT * FROM Vendedor";

		List<Vendedor> vendedores = new ArrayList<Vendedor>();

		ResultSet rset = null;
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
		
			while (rset.next()) {
				Vendedor vendedor = new Vendedor();
	
				vendedor.setIdVendedor(rset.getInt("idVendedor"));
	
				vendedor.setNome(rset.getString("nome"));
	
				vendedor.setCpf(rset.getString("cpf"));
	

				vendedores.add(vendedor);
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
		return vendedores;
	}

	public Vendedor getVendedorById(int idVendedor) {

		String sql = "SELECT * FROM Vendedor where idVendedor = ?";
		Vendedor vendedor = new Vendedor();

		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idVendedor);
			rset = pstm.executeQuery();

			rset.next();

			vendedor.setNome(rset.getString("nome"));
			vendedor.setCpf(rset.getString("cpf"));

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
		return vendedor;
	}

}

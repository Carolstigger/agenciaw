package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import model.Compra;


public class CompraDAO {
	
	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Compra compra) {

		String sql = "INSERT INTO Compra (data,valor,formaDePagamento)" + " VALUES(?,?,?)";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, compra.getData());
			pstm.setDouble(2, compra.getValor());
			pstm.setString(3, compra.getFormaDePagamento());
		

		
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

	public void removeById(int idCompra) {

		String sql = "DELETE FROM Compra WHERE idCompra = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idCompra);
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

	public void update(Compra compra) {
		String sql = "UPDATE Compra SET data = ?,valor=?,formaDePagamento=?" + "WHERE idCompra = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, compra.getData());
			pstm.setDouble(2, compra.getValor());
			pstm.setString(3, compra.getFormaDePagamento());

			pstm.setInt(4, compra.getIdCompra());
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

	public List<Compra> getCompras() {

		String sql = "SELECT * FROM Compra";

		List<Compra> compras = new ArrayList<Compra>();

		ResultSet rset = null;
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				Compra compra = new Compra();
				
				compra.setIdCompra(rset.getInt("idCompra"));
				
				compra.setData(rset.getString("data"));
			
				compra.setValor(rset.getDouble("valor"));
				
				compra.setFormaDePagamento(rset.getString("formaDePagamento"));
				
				
				
			
				compras.add(compra);
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
		return compras;
	}

	public Compra getCompraById(int idCompra) {

		String sql = "SELECT * FROM Compra where idCompra = ?";
		Compra compra = new Compra();

		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idCompra);
			rset = pstm.executeQuery();

			rset.next();
			
			
			compra.setData(rset.getString("data"));
			
			compra.setValor(rset.getDouble("valor"));
			
			compra.setFormaDePagamento(rset.getString("formaDePagamento"));
			
			


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
		return compra;
	}


}

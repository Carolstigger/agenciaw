package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import model.Pacote;


public class PacoteDAO {
	
	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Pacote pacote) {

		String sql = "INSERT INTO Pacote (data,destino,tipo,valor)" + " VALUES(?,?,?,?)";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, pacote.getData());
			pstm.setString(2, pacote.getDestino());
			pstm.setString(3, pacote.getTipo());
			pstm.setDouble(4, pacote.getValor());

		
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

	public void removeById(int idPacote) {

		String sql = "DELETE FROM pacote WHERE idPacote = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idPacote);
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

	public void update(Pacote pacote) {
		String sql = "UPDATE Pacote SET data = ?,destino=?,tipo=?,valor=?" + "WHERE idPacote = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, pacote.getData());
			pstm.setString(2, pacote.getDestino());
			pstm.setString(3, pacote.getTipo());
			pstm.setDouble(4, pacote.getValor());

			pstm.setInt(5, pacote.getIdPacote());
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

	public List<Pacote> getPacotes() {

		String sql = "SELECT * FROM Pacote";

		List<Pacote> pacotes = new ArrayList<Pacote>();

		ResultSet rset = null;
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				Pacote pacote = new Pacote();
				
				pacote.setIdPacote(rset.getInt("idPacote"));
				
				pacote.setData(rset.getString("data"));
			
				pacote.setDestino(rset.getString("destino"));
				
				pacote.setTipo(rset.getString("tipo"));
				
				pacote.setValor(rset.getDouble("valor"));
				
				
			
				pacotes.add(pacote);
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
		return pacotes;
	}

	public Pacote getPacoteById(int idPacote) {

		String sql = "SELECT * FROM pacote where idPacote = ?";
		Pacote pacote = new Pacote();

		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idPacote);
			rset = pstm.executeQuery();

			rset.next();
			
			
			pacote.setData(rset.getString("data"));
			
			pacote.setDestino(rset.getString("destino"));
			
			pacote.setTipo(rset.getString("tipo"));
			
			pacote.setValor(rset.getDouble("valor"));


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
		return pacote;
	}


}

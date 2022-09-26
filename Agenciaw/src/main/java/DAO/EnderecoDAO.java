package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import model.Endereco;


public class EnderecoDAO {
	
	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Endereco endereco) {

		String sql = "INSERT INTO Endereco (rua,bairro,cidade,numero,cep)" + " VALUES(?,?,?,?,?)";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, endereco.getRua());
			pstm.setString(2, endereco.getBairro());
			pstm.setString(3, endereco.getCidade());
			pstm.setInt(4, endereco.getNumero());
			pstm.setString(5, endereco.getCep());
		
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

	public void removeById(int idEndereco) {

		String sql = "DELETE FROM Endereco WHERE idEndereco = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idEndereco);
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

	public void update(Endereco endereco) {
		String sql = "UPDATE Endereco SET rua = ?,bairro=?,cidade=?,numero=?,cep=?" + "WHERE idEndereco = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, endereco.getRua());
			pstm.setString(2, endereco.getBairro());
			pstm.setString(3, endereco.getCidade());
			pstm.setInt(4, endereco.getNumero());
			pstm.setString(5, endereco.getCep());
			
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

	public List<Endereco> getEnderecos() {

		String sql = "SELECT * FROM Endereco";

		List<Endereco> enderecos = new ArrayList<Endereco>();

		ResultSet rset = null;
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				
				Endereco endereco = new Endereco();
				
				endereco.setIdEndereco(rset.getInt("idEndereco"));
				
				endereco.setRua(rset.getString("rua"));
			
				endereco.setBairro(rset.getString("bairro"));
				
				endereco.setCidade(rset.getString("cidade"));
				
				endereco.setNumero(rset.getInt("numero"));
				
				endereco.setCep(rset.getString("cep"));
				
				
				
			
				enderecos.add(endereco);
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
		return enderecos;
	}

	public Endereco getEnderecoById(int idEndereco) {

		String sql = "SELECT * FROM Endereco where idEndereco = ?";
		Endereco endereco = new Endereco();

		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idEndereco);
			rset = pstm.executeQuery();

			rset.next();
			
			endereco.setIdEndereco(rset.getInt("idEndereco"));
			
			endereco.setRua(rset.getString("rua"));
		
			endereco.setBairro(rset.getString("bairro"));
			
			endereco.setCidade(rset.getString("cidade"));
			
			endereco.setNumero(rset.getInt("numero"));
			
			endereco.setCep(rset.getString("cep"));

			


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
		return endereco;
	}


}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelo.Passagem;


public class PassagemDAO {

	Connection conn = null;
	PreparedStatement pstm = null;

	// Metodo para salvar
	public void save(Passagem passagem) {
		String sql = "INSERT INTO passagem (preco ,passagem) values(?,?);";

		try {
			// Criar conexão com o banco
			conn = ConnectionMySQL.createConnectionMySQL();

			// Cria um PreparedStatement, Classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adiciona o valor do primeiro paramentro da sql
			pstm.setDouble(1, passagem.getPreco_passagem());

			// Executa a sql para inserção dos dados
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

	// Metodo para Ler
	public List<Passagem> getPassagem() {
		String sql = "select * from passagem;";

		List<Passagem> lista = new ArrayList<Passagem>();
		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {
				Passagem passagem = new Passagem();

				passagem.setPreco_passagem(rset.getDouble("preco"));
				lista.add(passagem);

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
		return lista;
	}
	// Metodo para Atualizar

	public void update(Passagem passagem) {
		String sql = "UPDATE passagem set passagem = ?;";

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setDouble(1, passagem.getPreco_passagem());

			pstm.setInt(2, passagem.getIdPassagem());

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally

		{
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

//Metodo para Deletar
	public void deleteById(int id) {
		String sql = "DELETE FROM passagem WHERE id_passagem = ?";

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
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
	public Passagem getPassagemById(int id) {
		String sql = "SELECT * FROM passagem WHERE id_passagem = ?;";

		Passagem passagem = new Passagem();

		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);

			rset = pstm.executeQuery();
			rset.next();

			passagem.setPreco_passagem(rset.getDouble("preco"));
			passagem.setIdPassagem(rset.getInt("id_passagem"));
			//passagem.setDestino(rset.getInt("id_destino"));

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

		 return passagem;
	}

}

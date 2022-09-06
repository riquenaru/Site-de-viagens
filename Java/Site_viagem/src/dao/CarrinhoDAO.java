package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//import java.text.DateFormat;

import connection.ConnectionMySQL;

import modelo.Carrinho;

public class CarrinhoDAO {
	
	Connection conn = null;
	PreparedStatement pstm = null;
	
	// Metodo para salvar
	public void save (Carrinho carrinho) {
		String sql = "INSERT INTO carrinho (qtd_itens, total_compra, data_compra, passagem) values(?, ?, ?, ?);";

		try {
			// Criar conexão com o banco
			conn = ConnectionMySQL.createConnectionMySQL();
			
			//Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);
			
			// Adiciona o valor do primeiro paramentro
			pstm.setInt(1, carrinho.getIdCarrinho());
			pstm.setInt(2, carrinho.getQtd_item());
			pstm.setDouble(3, carrinho.getValor_total());
			pstm.setDate(4, (Date) carrinho.getData_compra());
			pstm.setString(5, carrinho.get);
		}
	}
}
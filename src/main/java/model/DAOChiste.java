package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.Conexion;

public class DAOChiste {
	public ArrayList<Chiste> getChistes(String categoria) {
		ResultSet rs;
		ArrayList<Chiste> lista = new ArrayList<Chiste>();

		Connection con = Conexion.conecta();
		Statement st;
		try {
			st = con.createStatement();
			String ordenSql = "SELECT id, adopo, descripcion, titulo from  chiste where idcategoria="+categoria;
			rs = st.executeQuery(ordenSql);

			while (rs.next()) {
				Chiste chiste = new Chiste();
				chiste.setId(rs.getInt("id"));
				chiste.setApodo(rs.getString("adopo"));
				chiste.setDescripcion(rs.getString("descripcion"));
				chiste.setTitulo(rs.getString("titulo"));
				lista.add(chiste);
			}
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			System.out
					.println("Error al acceder a la BDs: " + e.getMessage());
		}
		return lista;
	}

}

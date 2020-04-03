package it.corso.java.rubrica.business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.MysqlDataSource;

import it.corso.java.rubrica.model.Contatto;

public class RubricaBusiness {
	/* dichiaro interfaccia di connessione */
	private Connection con;
	/* per il discorso singletonpattern */
	private static RubricaBusiness rb;
	
	public static RubricaBusiness getInstances() {
		if (rb == null) {
			rb = new RubricaBusiness();
		}
		return rb;
	}
	
	/* connessione al database */
	private Connection getConnection() throws SQLException {
		if (con == null) {
			MysqlDataSource dataSource = new MysqlDataSource();
			/* compila il datasource con i dati necessari per la connessione */
			dataSource.setServerName("127.0.0.1");
			dataSource.setPortNumber(3306);
//			dataSource.setUser("root");
//			dataSource.setPassword("{06[novembre]18}");
			dataSource.setUser("CorsoJava");
			dataSource.setPassword("Paolo_Preite");
			dataSource.setDatabaseName("corso_java_rubrica");
			dataSource.setServerTimezone("Europe/Rome");
			
			con = dataSource.getConnection();
		}
		return con;
	}
	
	public int aggiungiContatto(Contatto c) throws SQLException {
		String sql = "INSERT INTO contatti(nome, cognome, telefono) VALUES(?, ?, ?)";
		PreparedStatement ps = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, c.getNome());
		ps.setString(2, c.getCognome());
		ps.setString(3, c.getTelefono());
		ps.executeUpdate();
		ResultSet rs = ps.getGeneratedKeys();
		rs.next();
		System.out.println("elemento aggiunto con successo. il suo id è -> " + rs.getInt(1));
		return rs.getInt(1);
	}
	
	public List<Contatto> ricercaContatti() throws SQLException {
		String sql = "SELECT * FROM contatti;";
		PreparedStatement ps = getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<Contatto> contatti = new ArrayList<Contatto>();
		while(rs.next()) {
			Contatto c = new Contatto();
			c.setId(rs.getInt(1));
			c.setNome(rs.getString(2));
			c.setCognome(rs.getString(3));
			c.setTelefono(rs.getString(4));
			contatti.add(c);
		}
		return contatti;
	}
}
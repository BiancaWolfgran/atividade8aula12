package br.com.prog3.atividade8aula12.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection() {
			String driver = "org.postgresql.Driver";
			String user = "postgres";//Coloque o usuário criado para acesso ao banco
			String senha = "1234";//Coloque a senha para acesso ao banco
			String url = "jdbc:postgresql://127.0.0.1:5432/aula12";//Coloque o servidor onde está instalado o banco
			Connection con = null;
			try {
				Class.forName(driver);
				con = (Connection) DriverManager.getConnection(
				url, user, senha);
				//System.out.println("Conexão realizada com sucesso.");
			} 
			catch (ClassNotFoundException ex) {
				System.err.print(ex.getMessage());
			} 
			catch (SQLException e) {
				System.err.print(e.getMessage());
			}
			
			return con;
	}
	
	public static void close(Connection con){
		try{
			con.close();
		}
		catch(Exception e){
		}
	}

}

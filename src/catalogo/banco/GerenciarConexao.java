package catalogo.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

    public class GerenciarConexao {
        private static final String Driver = "com.mysql.jdbc.Driver";
        private static final String URL = "jdbc:mysql://localhost:3306/catalogoloja";
        private static final String USER = "root";
        private static final String PASS = "";
        
        public static Connection getConnection()
        {
            try {
                Class.forName(Driver);
                return DriverManager.getConnection(URL, USER, PASS);
                
            } catch (ClassNotFoundException | SQLException ex) {
                throw new RuntimeException("Erro na conexão", ex);
            }
        }
        
        public static void CloseConnection(Connection conexao)
        {
            if(conexao != null)
            {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    System.err.println("Erro ao finalizar conexão.");
                }
            }
        }
        
        public static void CloseConnection(Connection conexao, PreparedStatement estado)
        {
            if(estado != null)
            {
                try {
                    estado.close();
                } catch (SQLException ex) {
                    System.err.println("Erro ao finalizar conexão.");
                }
            }
            else
            {
                CloseConnection(conexao);
            }
        }
        
        public static void CloseConnection(Connection conexao, PreparedStatement estado,ResultSet rs)
        {
            if(rs != null)
            {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.err.println("Erro ao finalizar conexão.");
                }
            }
            else
            {
                CloseConnection(conexao, estado);
            }
        }
    }


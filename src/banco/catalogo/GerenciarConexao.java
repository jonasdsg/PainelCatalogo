package banco.catalogo;

import java.nio.channels.SeekableByteChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GerenciarConexao {
    private static final String DRIVER ="com.mysql.jdbc.Driver";
    private static final String URL ="jdbc:mysql//localhost:3306/catalogoloja";
    private static final String USER ="root";
    private static final String PASS ="";
    
    public static Connection getConnection()
    {
        try {
            Class.forName(DRIVER);
            try {
                return DriverManager.getConnection(URL, USER, PASS);
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
        return (null);
    }
    
    public static void closeConnection(Connection conexao)
    {
        if(conexao != null)
        {
            try {
                conexao.close();
            } catch (SQLException ex) {
                System.err.println("Erro ao finalizar conexao, relatorio ");
            }
        }
    }
    
    public static void closeConnection(Connection conexao, PreparedStatement estado)
    {
        if(estado != null)
        {
            try {
                estado.close();
            } catch (SQLException ex) {
                System.err.println("Erro ao finalizar conexao, relatorio ");
            }
        }
    }
    
    public static void closeConnection(Connection conexao, PreparedStatement estado, ResultSet resultado)
    {
        if(resultado != null)
        {
            try {
                resultado.close();
            } catch (SQLException ex) {
                System.err.println("Erro ao finalizar conexao, relatorio ");
            }
        }
    }

}

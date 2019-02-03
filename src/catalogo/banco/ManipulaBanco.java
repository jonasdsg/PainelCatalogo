package catalogo.banco;

import catalogo.classes.Dispositivo;
import catalogo.classes.PessoaFisica;
import catalogo.classes.PessoaJuridica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

    public class ManipulaBanco {
	private static final String driverConnector = "com.mysql.cj.jdbc.Driver";
	private static final String urlBanco = "jdbc:mysql://localhost:3306/catalogoloja"; 
	private static final String usrBanco = "root"; 
	private static final String passlBanco = "123";
	private static Connection conexao = null;
	
	public static Connection getConnection() throws ClassNotFoundException
	{
            Class.forName(driverConnector);
            try {
                conexao = DriverManager.getConnection(urlBanco, usrBanco, passlBanco);
                return conexao;
            } catch (SQLException excecao) {
                System.err.println("Erro "+excecao);
                return null;
            }    
	}
        
        public static void getInDataBase() throws SQLException
        {
            Statement stmt = conexao.createStatement();   
        }
        
        private void setPessoaFisicaInDataBase(PessoaFisica pessoa,String sqlQuery) throws SQLException
        {
            PreparedStatement valorDeclarado = conexao.prepareStatement(sqlQuery);
            valorDeclarado.setLong(1,pessoa.getChave());
            valorDeclarado.setString(2,pessoa.getNome());
            valorDeclarado.setString(3,pessoa.getTelefone());
            valorDeclarado.setString(4,pessoa.getCelular());
            valorDeclarado.setLong(5,pessoa.getEndereco().getCep());
            valorDeclarado.execute();
            valorDeclarado = conexao.prepareStatement("insert into pessoafisica(idpessoafisica,cpf,rg) values (?, ?, ?)");
            valorDeclarado.setLong(1, pessoa.getChave());
            valorDeclarado.setString(2, pessoa.getCpf());
            valorDeclarado.setString(3, pessoa.getRg());
            valorDeclarado.execute();
            conexao.close();
        }
        
        private void setPessoaJuridicaInDataBase(PessoaJuridica pessoa,String sqlQuery) throws SQLException
        {
            PreparedStatement valorDeclarado = conexao.prepareStatement(sqlQuery);
            valorDeclarado.setLong(1,pessoa.getChave());
            valorDeclarado.setString(2,pessoa.getNome());
            valorDeclarado.setString(3,pessoa.getTelefone());
            valorDeclarado.setString(4,pessoa.getCelular());
            valorDeclarado.setLong(5,pessoa.getEndereco().getCep());
            valorDeclarado.execute();
            valorDeclarado = conexao.prepareStatement("insert into pessoajuridica(idpessoajuridica,cnpj,ie) values (?, ?, ?)");
            valorDeclarado.setLong(1, pessoa.getChave());
            valorDeclarado.setString(2, pessoa.getCnpj());
            valorDeclarado.setString(3, pessoa.getIE());
            valorDeclarado.execute();
            conexao.close();
        }        
        
        private void setDispositivoInDataBase(Dispositivo dispositivo,String sqlQuery) throws SQLException
        {
            PreparedStatement valorDeclarado = conexao.prepareStatement(sqlQuery);
            valorDeclarado.setInt(1, dispositivo.getChaveDispositivo());
            valorDeclarado.setString(2,dispositivo.getDispositivo() );
            valorDeclarado.setString(3,dispositivo.getNumerodeSerie() );
            valorDeclarado.setString(4,dispositivo.getModelodoDispositivo() );
            valorDeclarado.setString(5,dispositivo.getDescricao() );
            valorDeclarado.setString(6,dispositivo.getEstadodoDispositivo() );
            valorDeclarado.setString(7,dispositivo.getLocal() );
            valorDeclarado.execute();
            conexao.close();
        }
 
}

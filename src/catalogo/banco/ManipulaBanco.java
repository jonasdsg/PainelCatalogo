package catalogo.banco;

import catalogo.classes.Dispositivo;
import catalogo.classes.Pessoa;
import catalogo.classes.Endereco;
import catalogo.classes.PessoaFisica;
import catalogo.classes.PessoaJuridica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

    public class ManipulaBanco {
	private static final String driverConnector = "com.mysql.cj.jdbc.Driver";
	private static final String urlBanco = "jdbc:mysql://localhost:3306/catalogoloja?useTimezone=true&serverTimezone=UTC"; 
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

       public static boolean setPessoaInDataBase(Pessoa pessoa) throws SQLException
        {
            String sqlQuery = "insert into pessoa(id_pessoa,nome_pessoa,telefone,celular,numero_casa) values (? ,? ,? ,? ,? )";
            try {
                ManipulaBanco.getConnection();
            } catch (ClassNotFoundException ex) {
                System.err.println("Erro na conexao.");
            }
            
            if(pessoa == null || pessoa.getNome().equals("")) return false;
            else
            {
                try {
                    ManipulaBanco.getConnection();
                } catch (ClassNotFoundException exp) {
                    System.err.println("Erro na conexao: "+exp);
                }

                PreparedStatement valorDeclarado = conexao.prepareStatement(sqlQuery);
                valorDeclarado.setLong(1,pessoa.getChave());
                valorDeclarado.setString(2,pessoa.getNome());
                valorDeclarado.setString(3,pessoa.getTelefone());
                valorDeclarado.setString(4,pessoa.getCelular());
                valorDeclarado.setLong(5,pessoa.getEndereco().getCep());
                valorDeclarado.execute();
                conexao.close();
                valorDeclarado.close();
                return true;
            }
        }        
        
        public static void setPessoaFisicaInDataBase(PessoaFisica pessoa) throws SQLException
        {
            String sqlQuery = "insert into pessoafisica(id_pf,cpf,rg,cep_endereco) values (?, ?, ?, ?)";
            setPessoaInDataBase(pessoa); 
            try {
                ManipulaBanco.getConnection();
            } catch (ClassNotFoundException exp) {
                System.err.println("Erro na conexao."+exp);
            }
           
            PreparedStatement valorDeclarado = conexao.prepareStatement(sqlQuery);
            valorDeclarado.setLong(1, pessoa.getChave());
            valorDeclarado.setString(2, pessoa.getCpf());
            valorDeclarado.setString(3, pessoa.getRg());
            valorDeclarado.setLong(4,pessoa.getCep());
            valorDeclarado.execute();
            conexao.close();
            valorDeclarado.close();
        }
        
        public static void setPessoaJuridicaInDataBase(PessoaJuridica pessoa,String sqlQuery) throws SQLException
        {
            try {
                ManipulaBanco.getConnection();
            } catch (ClassNotFoundException exp) {
                System.err.println("Erro na conexao: "+exp);
            }
            
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
        
        public static void setDispositivoInDataBase(Dispositivo dispositivo,String sqlQuery) throws SQLException
        {
            try {
                ManipulaBanco.getConnection();
            } catch (ClassNotFoundException ex) {
                System.err.println("Erro na conexao.");
            }
            
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
        
        public static void setEnderecoInDatabase(Endereco endereco,String sqlQuery) throws SQLException
        {

            try {
                ManipulaBanco.getConnection();
            } catch (ClassNotFoundException exp) {
                System.err.println("Erro na conexao: "+exp);
            }
            
            PreparedStatement valorDeclarado = conexao.prepareStatement(sqlQuery);
            valorDeclarado.setLong(1,endereco.getCep());
            valorDeclarado.setString(2, endereco.getRua());
            valorDeclarado.setString(3, endereco.getBairro());
            valorDeclarado.setString(4, endereco.getCidade());
            valorDeclarado.setString(5, endereco.getEstado());
            valorDeclarado.setString(6, endereco.getUf());
            valorDeclarado.execute();
            conexao.close();
            valorDeclarado.close();
        }
 
}

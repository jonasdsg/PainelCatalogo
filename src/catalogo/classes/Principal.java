package catalogo.classes;

import catalogo.banco.ManipulaBanco;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

    public class Principal{
	public static void main(String[] args)
	{
            Endereco endereco = new Endereco();
            Endereco endereco2 = new Endereco();
            endereco.setCep(2005001);
            endereco.setRua("Rua limites");
            endereco.setBairro("Realengo");
            endereco.setCidade("Rio de janeiro");
            endereco.setMunicipio("Rio de janeiro");
            endereco.setEstado("Rio de janeiro");
            endereco.setUf("RJ");
            

            endereco2.setCep(23005001);
            endereco2.setRua("Rua Almirante Barroso");
            endereco2.setBairro("Centro");
            endereco2.setCidade("Rio de janeiro");
            endereco2.setMunicipio("Rio de janeiro");
            endereco2.setEstado("Rio de janeiro");
            endereco2.setUf("RJ");
            
            
            PessoaFisica cliente = new PessoaFisica("Jonas dos Santos Goes","222.345.986-23",endereco);
            PessoaFisica cliente2 = new PessoaFisica("Roberto Marinho Santos ","333.345.986-23",endereco2);
            cliente.setCelular("(21) 9099-5550");
            cliente.setRg("33.588.818-0");
            cliente.setTelefone("(21) 2233-4455");
            
            endereco.setCep(2005001);
            endereco.setRua("Rua limites");
            endereco.setBairro("Realengo");
            endereco.setCidade("Rio de janeiro");
            endereco.setMunicipio("Rio de janeiro");
            endereco.setEstado("Rio de janeiro");
            endereco.setUf("RJ");
            
            cliente2 = new PessoaFisica("Jonas dos Santos Goes","222.345.986-23",endereco);
            cliente2.setCelular("(21) 9099-5550");
            cliente2.setRg("33.588.818-0");
            cliente2.setTelefone("(21) 2233-4455");
            
            
            try {
                ManipulaBanco.setEnderecoInDatabase(endereco,"insert into endereco(cep,rua,bairro,municipio,cidade,estado,uf) values (? ,? ,? ,? ,? ,? ,?)");
                ManipulaBanco.setPessoaFisicaInDataBase(cliente, "insert into pessoa(idpessoa, nomepessoa, telefone, celular, enderecofk) values(? ,? ,? ,? ,? )");
                
                ManipulaBanco.setEnderecoInDatabase(endereco2,"insert into endereco(cep,rua,bairro,municipio,cidade,estado,uf) values (? ,? ,? ,? ,? ,? ,?)");
                ManipulaBanco.setPessoaFisicaInDataBase(cliente2, "insert into pessoa(idpessoa, nomepessoa, telefone, celular, enderecofk) values(? ,? ,? ,? ,? )");
            } catch (SQLException exp) {
                System.err.println("Erro ao inserir dados "+exp);
            }
            
            
            
	}
    }
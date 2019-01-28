package br.com.catalogo;
import java.util.Scanner;

import br.com.catalogo.Dispositivo;
import br.com.catalogo.PessoaFisica;
import br.com.catalogo.PessoaJuridica;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class Principal{
	public static void main(String[] args)
	{
		String nome;
		PessoaFisica cliente = new PessoaFisica(1,"Mario Augusto","222.345.986-23");
		PessoaJuridica cliente2 = new PessoaJuridica(2,"Joaquim Santana","098.555.0001/70");
		Dispositivo dispositivo = new Dispositivo(1,"Placa Mae");
		System.out.println(cliente.getNome()+" "+cliente2.getCnpj()+" "+dispositivo.getDispositivo());
		Scanner teclado = new Scanner(System.in);
		nome = teclado.nextLine();
		cliente.setNome(nome);
		System.out.println(cliente.getNome());
		System.out.println(cliente.getNome()+" "+cliente2.getCnpj()+" "+dispositivo.getDispositivo());
		

	}
}
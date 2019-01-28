package br.com.catalogo;

import br.com.catalogo.Endereco;

abstract class Pessoa{
	protected long chaveCliente;
	protected String nome,telefone;
	protected Endereco endereco;
	
	public long getChaveCliente() {
		return chaveCliente;
	}
	public void setChaveCliente(long chaveCliente) {
		this.chaveCliente = chaveCliente;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
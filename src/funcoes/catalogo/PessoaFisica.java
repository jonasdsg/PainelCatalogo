package funcoes.catalogo;

public class PessoaFisica extends Pessoa{
	String cpf,rg;

	public String getCpf()
	{
		return this.cpf;
	}
	
	public boolean setCpf(String cpf)
	{
		if(cpf == null || cpf.equals("")) return false;
		else
		{
			this.cpf = cpf;
			return true;
		}
	}
	public String getRg()
	{
		return this.rg;
	}
	
	public boolean setRg(String rg)
	{
		if(rg == null || rg.equals("")) return false;
		else
		{
			this.rg = rg;
			return true;
		}
	}
	
	public PessoaFisica(long chave,String nome,String cpf)
	{
		this.setNome(nome);
		this.setCpf(cpf);
		this.setChaveCliente(chave);
	}	
}

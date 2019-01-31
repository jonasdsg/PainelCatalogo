package catalogo.classes;

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
	
	public PessoaFisica(String nome,String cpf)
	{
            super(nome);
            this.setCpf(cpf);
            Pessoa.setChaveCliente();
            this.chave = Pessoa.getControledeChaveCliente();
	}	
    }
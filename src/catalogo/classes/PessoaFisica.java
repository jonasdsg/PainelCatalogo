package catalogo.classes;

    public class PessoaFisica extends Pessoa{
	String cpf,rg;
        long cep;

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

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
	
	public PessoaFisica(String nome,String cpf,Endereco endereco)
	{
            super(nome);
            this.setCpf(cpf);
            Pessoa.setChaveCliente();
            this.chave = Pessoa.getControledeChaveCliente();
            this.setEndereco(endereco);
	}	
    }

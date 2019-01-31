package catalogo.classes;

    public class PessoaJuridica extends Pessoa{
	String cnpj,inscricaoEstadual;
	
        public String getCnpj()
	{
            return this.cnpj;
	}
        
	public boolean setCnpj(String cnpj)
	{
            if(cnpj.equals("") || cnpj == null) return false;
            else 
            {
                this.cnpj = cnpj;
		return true;
            }
	}
	
	public String getIE()
	{
            return this.inscricaoEstadual;
	}
        
	public boolean setIE(String ie)
	{
            if(ie.equals("") || ie == null) return false;
            else 
            {
                this.inscricaoEstadual = ie;
		return true;
            }
	}
	
	public PessoaJuridica(String nome,String cnpj)
	{
            super(nome);
            this.setCnpj(cnpj);
            Pessoa.setChaveCliente();
            this.chave = Pessoa.getControledeChaveCliente();
	}
    }

package funcoes.catalogo;

public class Endereco{
	private String cep,rua,bairro,municipio,cidade,estado,uf;
	public boolean setRua(String rua){
		if(rua == null || rua.equals(""))
		{
			return false;
		}
		else 
		{
			this.rua = rua;
			return true;
		}
	}

	public boolean setBairro(String bairro){
		if(bairro == null || bairro.equals(""))
		{
			return false;
		}
		else 
		{
			this.bairro = bairro;
			return true;
		}
	}	

	public boolean setMunicipio(String municipio){
		if(municipio == null || municipio.equals(""))
		{
			return false;
		}
		else 
		{
			this.municipio = municipio;
			return true;
		}
	}
	public boolean setCidade(String cidade){
		if(cidade == null || cidade.equals(""))
		{
			return false;
		}
		else 
		{
			this.cidade = cidade;
			return true;
		}
	}	
	public boolean setEstado(String estado){
		if(estado == null || estado.equals(""))
		{
			return false;
		}
		else 
		{
			this.estado = estado;
			return true;
		}
	}
	public boolean setUf(String uf){
		if(uf == null || uf.equals(""))
		{
			return false;
		}
		else 
		{
			this.uf = uf;
			return true;
		}
	}

	public String getRua()
	{
		return this.rua;
	}
	
	public String getBairro()
	{
		return this.bairro;
	}

	public String getMunicipio()
	{
		return this.municipio;
	}

	public String getCidade()
	{
		return this.cidade;
	}

	public String getEstado()
	{
		return this.estado;
	}

	public String getUf()
	{
		return this.uf;
	}

	public String getCep() {
		return this.cep;
	}

 
    public void setCep(String cep) {
		this.cep = cep;
	}	

}
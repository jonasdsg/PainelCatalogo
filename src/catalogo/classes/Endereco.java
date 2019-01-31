package catalogo.classes;

import javafx.scene.control.Alert;

    public class Endereco{
        
	private String cep,rua,bairro,municipio,cidade,estado,uf;
	
        public Endereco()
        {}
        
        public void CadastraEndereco(String cep,String rua, String bairro,String municipio,String cidade,String estado,String uf)
        {
            Alert alerta;
            alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Erro ao inserir dado");
            alerta.setHeaderText("O valor informado está vazio ou nulo");

            if(!this.setRua(rua))
            {
                alerta.setContentText("O valor inserido para rua está incorreto, favor entre com novos dados.");
                alerta.show();
            }
            
            if(!this.setBairro(bairro))
            {
                alerta.setContentText("O valor inserido para Bairro está incorreto, favor entre com novos dados.");
                alerta.show();
            }
            
            if(!this.setCidade(cidade))
            {
                alerta.setContentText("O valor inserido para Cidade está incorreto, favor entre com novos dados.");
                alerta.show();
            }
            
            if(!this.setMunicipio(municipio))
            {
                alerta.setContentText("O valor inserido para municipio está incorreto, favor entre com novos dados.");
                alerta.show();
            }
            
            if(!this.setEstado(estado))
            {
                alerta.setContentText("O valor inserido para estado está incorreto, favor entre com novos dados.");
                alerta.show();
            }
            
            if(!this.setUf(uf))
            {
                alerta.setContentText("O valor inserido para UF está incorreto, favor entre com novos dados.");
                alerta.show();
            }
            
            if(!this.setCep(cep))
            {
                alerta.setContentText("O valor inserido para CEP está incorreto, favor entre com novos dados.");
                alerta.show();
            }
        }
        
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
        
	public boolean setEstado(String estado)
        {
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
        
	public boolean setUf(String uf)
        {
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

        public String getCep() 
        {
            return this.cep;
        }

        public boolean setCep(String cep) 
        {
            if(cep == null || cep.equals("")) return false;
            else 
            {
                this.cep = cep;    
                return true;
            }
        }
    }

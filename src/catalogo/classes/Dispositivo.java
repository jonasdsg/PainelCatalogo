package catalogo.classes;

    public class Dispositivo{
        private static int gerarChaveDispositivo;
        private int chaveDispositivo;
	private String tipodeDispositivo,numerodeSerie,modelodoDispositivo,descricaodoDispositivo,estadodoDispositivo,local;
	
	public boolean setDispositivo(String dispositivo)
	{
            if(dispositivo == null || dispositivo.equals(""))
            {
                return false;
            }
            
            else 
            {
                this.tipodeDispositivo = dispositivo;
                return true;
            }
        }

	public boolean setNumerodeSerie(String numerodeSerie)
	{
            if(numerodeSerie == null || numerodeSerie.equals("")) return false;
            
            else 
            {
                this.numerodeSerie = numerodeSerie;
                return true;
            }
	}	

	public boolean setModelodoDispositivo(String modelodoDispositivo)
	{
            if(modelodoDispositivo == null || modelodoDispositivo.equals("")) return false;
            
            else
            {
                this.modelodoDispositivo = modelodoDispositivo;
                return true;
            }
	}

	public boolean setDescricaodoDispositivo(String descricaodoDispositivo)
	{
            if(descricaodoDispositivo == null || descricaodoDispositivo.equals("")) return false;
            
            else 
            {
                this.descricaodoDispositivo = descricaodoDispositivo;
                return true;
            }
	}	

	public boolean setEstadodoDispositivo(String estadodoDispositivo)
	{
            if(estadodoDispositivo == null || estadodoDispositivo.equals("")) return false;
            
            else
            {
                this.estadodoDispositivo = estadodoDispositivo;
                return true;
            }
	}

	public String getDispositivo()
	{
            return this.tipodeDispositivo;
	}

	public String getModelodoDispositivo()
	{
            return this.modelodoDispositivo;
	}

	public String getNumerodeSerie()
	{
            return this.numerodeSerie;
	}

	public String getDescricao()
	{
            return this.descricaodoDispositivo;
	}

	public String getEstadodoDispositivo()
	{
            return this.estadodoDispositivo;
	}

	public int getChaveDispositivo()
	{
            return chaveDispositivo;
	}
        public Dispositivo()
        {}
        
	public Dispositivo(String tipo)
	{
            this.setDispositivo(tipo);
            Dispositivo.setGerarChaveDispositivo();
            this.chaveDispositivo = Dispositivo.getGerarChaveDispositivo();
	}

    public static int getGerarChaveDispositivo() {
        return gerarChaveDispositivo;
    }

    public static void setGerarChaveDispositivo()
    {
        Dispositivo.gerarChaveDispositivo++;
    }
        
	public String getLocal() 
	{
            return local;
	}

	
	public boolean setLocal(String local) 
	{
            if(local.equals("") || local == null) return false;
            
            else
            {		
		this.local = local;
                return true;
            }
	}
    }
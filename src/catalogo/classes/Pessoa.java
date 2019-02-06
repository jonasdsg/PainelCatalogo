package catalogo.classes;

    public class Pessoa{
    
	protected static long controledeChaveCliente;
	protected long chave;
        protected String nome,telefone,celular;

        public String getCelular() {
            return celular;
        }

        public void setCelular(String celular) {
            this.celular = celular;
        }
	protected Endereco endereco;
	
	public static long getControledeChaveCliente() {
            return Pessoa.controledeChaveCliente;
	}
        
	public static void setChaveCliente() {
            Pessoa.controledeChaveCliente++;
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
        
	public boolean setNome(String nome) {
            
            if(nome == null || nome.equals(""))
            {
                return false;
            }
            else
            {
                this.nome = nome;
                return true;
            }
	}
        
	public Endereco getEndereco() {
            return endereco;
	}
        
	public boolean setEndereco(Endereco endereco) {
            if(endereco == null || endereco.getRua().equals(""))
            {
                System.err.println("Falha ao inserir endereco.");
                return false;
            }
            else
            {
                this.endereco = endereco;
                return true;
            }
        }
        
        public Pessoa(String nome)
        {
            this.setNome(nome);
        }

        public long getChave() {
            return chave;
        }     
    }

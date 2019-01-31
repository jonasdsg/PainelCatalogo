package catalogo.classes;

    public class Principal{
	public static void main(String[] args)
	{
            String nome;
            PessoaFisica cliente = new PessoaFisica("Mario Augusto","222.345.986-23");
            PessoaJuridica cliente2 = new PessoaJuridica("Joaquim Santana","098.555.0001/70");
            Dispositivo dispositivo = new Dispositivo("Placa Mae");
            Dispositivo dispositivo2 = new Dispositivo("Placa Fonte");
            System.out.println(cliente.getNome()+" "+cliente2.getCnpj()+" "+dispositivo.getDispositivo());
            System.out.println(cliente.getNome());
            System.out.println(cliente.getNome()+" "+cliente2.getCnpj()+" "+dispositivo.getDispositivo());
            System.out.println("A chave de "+cliente.getNome()+" e "+cliente.getChave());
            System.out.println("A chave de "+cliente2.getNome()+" e "+cliente2.getChave());
            System.out.println("A chave de "+dispositivo.getDispositivo()+" e "+dispositivo.getChaveDispositivo());
            System.out.println("A chave de "+dispositivo2.getDispositivo()+" e "+dispositivo2.getChaveDispositivo());
	}
    }
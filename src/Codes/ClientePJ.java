package SLV;/* Programação Orientada a Objetos - N12A (2019_01)
   Alunos - Gabriela dos Reis Bueno   - RA:1771078
            João Marcel Nantes Moreno - RA:2100398
            Luiz Felipe Moralez Amud  - RA:1884921
*/ // Classe Cliente CNPJ

public class ClientePJ extends Cliente
{
    // Atributos

    private String cnpj;
    private String nomeMotorista;

    // Metodo Construtor / Criar

    public ClientePJ(String nome, String fone, Endereco endereco, String cnpj, String nomeMotorista)
	{
		super(nome, fone, endereco);
		this.cnpj = cnpj;
		this.nomeMotorista = nomeMotorista;
	}

	public static ClientePJ criar()
	{
		Cliente cliente = Cliente.criar(); // super

		System.out.print ("\n\t Digite seu CNPJ: ");
		String cnpj = Leitura.lerString();

		System.out.print ("\n\t Digite o nome do Motorista: ");
		String nomeMotorista = Leitura.lerString();

		return new ClientePJ (cliente.getNome(), cliente.getFone(), cliente.getEndereco(), cnpj, nomeMotorista);
    }
    
    // Metodos

    public String getCnpj()
	{
		return this.cnpj;
	}

    public void setCnpj (String cnpj)
	{
		this.cnpj = cnpj;
	}

	public String getNomeMotorista()
	{
		return this.nomeMotorista;
	}

	public void setNomeMotorista(String nomeMotorista)
	{
		this.nomeMotorista = nomeMotorista;
    }
    
    // Metodo toString

	public String toString()
	{
		return super.toString() + " | " + this.cnpj + " | " + this.nomeMotorista;
	}
}

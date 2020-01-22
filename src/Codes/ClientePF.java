package Codes;/* Programação Orientada a Objetos - N12A (2019_01)
   Alunos - Gabriela dos Reis Bueno   - RA:1771078
            João Marcel Nantes Moreno - RA:2100398
            Luiz Felipe Moralez Amud  - RA:1884921
*/ // Classe Cliente CPF

public class ClientePF extends Cliente
{
    // Atributos

    private String cpf;

    // Metodo Construtor / Criar

    public ClientePF(String nome, String fone, Endereco endereco, String cpf)
	{
		super(nome, fone, endereco);
		this.cpf = cpf;
    }
    
    public ClientePF(Cliente cliente, String cpf)
	{
		setNome(cliente.getNome());
		setFone(cliente.getFone());
		setEndereco(cliente.getEndereco());

		this.cpf = cpf;
	}

	public static ClientePF criar()
	{
		Cliente cliente = Cliente.criar(); // super

		System.out.print ("\n\t Digite seu CPF: ");
		String cpf = Leitura.lerString();

		return new ClientePF(cliente, cpf);
    }
    
    // Metodos

    public String getCpf()
	{
		return this.cpf;
	}

	public void setCpf(String cpf)
	{
		this.cpf = cpf;
    }
    
    // Metodo toString

    public String toString()
	{
		return super.toString() + " | " + this.cpf;
	}
}

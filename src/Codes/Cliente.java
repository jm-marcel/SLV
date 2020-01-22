package Codes;/* Programação Orientada a Objetos - N12A (2019_01)
   Alunos - Gabriela dos Reis Bueno   - RA:1771078
            João Marcel Nantes Moreno - RA:2100398
            Luiz Felipe Moralez Amud  - RA:1884921
*/ // Classe Cliente

public class Cliente
{
    // Atributos

    private String nome;
    private String fone;
    private Endereco endereco;

    // Metodo Construtor / Criar

    public Cliente () {}

	public Cliente (String nome, String fone, Endereco endereco)
	{
		this.nome = nome;
		this.fone = fone;
		this.endereco = endereco;
	}

	public static Cliente criar()
	{
		String nome;
		String fone;

		System.out.print ("\n\t Digite seu nome: ");
		nome = Leitura.lerString();

		System.out.print ("\n\t Digite seu telefone: ");
		fone = Leitura.lerString();

		Endereco endereco = Endereco.criar();

		return new Cliente(nome, fone, endereco);
    }
    
    // Metodos

    public String getNome()
	{
		return this.nome;
	}

    public void setNome(String nome)
	{
		this.nome = nome;
    }
    
    public String getFone()
	{
		return this.fone;
	}

	public void setFone(String fone)
	{
		this.fone = fone;
    }
    
    public Endereco getEndereco()
	{
		return this.endereco;
	}

	public void setEndereco(Endereco endereco)
	{
		this.endereco = endereco;
    }
    
    // Metodo toString

    public String toString()
	{
		return "\n\t| Nome: " + this.nome + " | Telefone: " + this.fone + " | Endereco: " + this.endereco;
	}
}

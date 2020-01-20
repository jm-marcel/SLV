package SLV;/* Programação Orientada a Objetos - N12A (2019_01)
   Alunos - Gabriela dos Reis Bueno   - RA:1771078
            João Marcel Nantes Moreno - RA:2100398
            Luiz Felipe Moralez Amud  - RA:1884921
*/ // Classe Veiculo

public class Veiculo // extends Locacao
{
    // Atributos

    private int veiculoID;
	private String placa;
	private String cor;
	private int nroPortas;
	private char tipoCombustivel;
	private long quilometragem;
    private double valorDiaria;
    
    // Metodo Construtor / Criar

    public Veiculo (String placa, String cor, int nroPortas, char tipoCombustivel, long quilometragem, double valorDiaria)
	{
        setVeiculoID();
        this.placa = placa;
        this.cor = cor;
        this.nroPortas = nroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quilometragem = quilometragem;
        this.valorDiaria = valorDiaria;
    }

    // Metodos
    
    public int getVeiculoID()
	{
		return this.veiculoID;
    }
    
    public void setVeiculoID ()
	{
		this.veiculoID = Utilitaria.idVeiculo;
		Utilitaria.idVeiculo += 1;
	}

	public String getPlaca()
	{
		return this.placa;
	}

	public void setPlaca(String placa)
	{
		this.placa = placa;
	}

	public String getCor()
	{
		return this.cor;
	}

	public void setCor(String cor)
	{
		this.cor = cor;
	}

	public int getNroPortas()
	{
		return this.nroPortas;
	}

	public void setNroPortas(int nroPortas)
	{
		this.nroPortas = nroPortas;
	}

	public char getTipoCombustivel()
	{
		return this.tipoCombustivel;
	}

	public void setTipoCombustivel(char tipoCombustivel)
	{
		this.tipoCombustivel = tipoCombustivel;
	}

	public long getQuilometragem()
	{
		return this.quilometragem;
	}

	public void setQuilometragem(long quilometragem)
	{
		this.quilometragem = quilometragem;
	}

	public double getValorDiaria()
	{
		return this.valorDiaria;
	}

	public void setValorDiaria(double valorDiaria)
	{
		this.valorDiaria = valorDiaria;
    }

    public double calcularCusto(int dias, long km)
	{
		double aux = dias * this.valorDiaria;

		if(km / dias > 100)
		{
			aux += Utilitaria.custoKmExtra * ((km / dias) - 100);
		}
		
		return aux;
	}
    
    // Metodo toString

	public String toString()
	{
		return this.veiculoID + " | " + this.placa + " | " + this.cor + " | " + this.nroPortas + " | " + this.tipoCombustivel + " | " + this.quilometragem + " | " + this.valorDiaria;
	}
}

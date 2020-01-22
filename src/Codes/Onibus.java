package Codes;/* Programação Orientada a Objetos - N12A (2019_01)
   Alunos - Gabriela dos Reis Bueno   - RA:1771078
            João Marcel Nantes Moreno - RA:2100398
            Luiz Felipe Moralez Amud  - RA:1884921
*/ // Classe Onibus

public class Onibus extends Veiculo
{
    // Atributos

    private int nroPassageiros;
	private double vlSeguroPassageiros;
	private boolean guia;

    // Metodo Construtor / Criar

    public Onibus (String placa, String cor, int nroPortas, char tipoCombustivel, long quilometragem, double valorDiaria, int nroPassageiros, double vlSeguroPassageiros, boolean guia)
	{
        super(placa, cor, nroPortas, tipoCombustivel, quilometragem, valorDiaria);
        this.nroPassageiros = nroPassageiros;
        this.vlSeguroPassageiros = vlSeguroPassageiros;
        this.guia = guia;
    }

    public static Onibus criar()
	{
		boolean guia;
		Veiculo v = Automovel.criar();

		System.out.print("\n\t Digite o numero de passageiros: \n");

		int nroPassageiros = Leitura.lerInt();

		System.out.print("\n\t Digite o valor do seguro por passageiro: \n");

		double vlSeguroPassageiros = Leitura.lerDouble();

		System.out.print("\n\t Digite 'S' para adicionar o guia e 'N' para recusar: \n");

		String guiaTeste = Leitura.lerString();

		guia = guiaTeste.equals ("S") || guiaTeste.equals ("s");

		return new Onibus(v.getPlaca(), v.getCor(), v.getNroPortas(), v.getTipoCombustivel(), v.getQuilometragem(), v.getValorDiaria(), nroPassageiros, vlSeguroPassageiros, guia);
	}

    // Metodos

    public int getNroPassageiros()
	{
		return nroPassageiros;
	}

	public void setNroPassageiros(int nroPassageiros)
	{
		this.nroPassageiros = nroPassageiros;
	}

	public double getVlSeguroPassageiros()
	{
		return this.vlSeguroPassageiros;
	}

	public void setVlSeguroPassageiros(double vlSeguroPassageiros)
	{
		this.vlSeguroPassageiros = vlSeguroPassageiros;
	}

	public boolean getGuia()
	{
		return guia;
	}

	public void setGuia(boolean guia)
	{
		this.guia = guia;
    }
    
    public double calcularCustos(int dias, long km)
	{
		double aux = super.calcularCusto(dias, km);

		aux += this.nroPassageiros * vlSeguroPassageiros;

		if(this.guia)
		{
			aux += dias * Utilitaria.custoGuia;
        }
        
		return aux;
	}

    // Metodo toString

    public String toString()
	{
		return super.toString() + " | " + this.nroPassageiros + " | " + this.vlSeguroPassageiros + " | " + this.guia;
	}

}

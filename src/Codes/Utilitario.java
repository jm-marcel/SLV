package Codes;/* Programação Orientada a Objetos - N12A (2019_01)
   Alunos - Gabriela dos Reis Bueno   - RA:1771078
            João Marcel Nantes Moreno - RA:2100398
            Luiz Felipe Moralez Amud  - RA:1884921
*/ // Classe Utilitario

public class Utilitario extends Veiculo
{
    // Atributos

    private int capacidadeCarga;
	private int nroEixos;

    // Metodo Construtor / Criar

    public Utilitario (String placa, String cor, int nroPortas, char tipoCombustivel, long quilometragem, double valorDiaria, int capacidadeCarga, int nroEixos)
	{
        super(placa, cor, nroPortas, tipoCombustivel, quilometragem, valorDiaria);
        this.capacidadeCarga = capacidadeCarga;
		this.nroEixos = nroEixos;
    }

    public static Utilitario criar()
	{
		Veiculo v = Automovel.criar();

		System.out.print("\n\t Insira a capacida de carga do automovel: ");

		int capacidadeCarga = Leitura.lerInt();

		System.out.print("\n\t Insira o numero de eixos: ");

		int nroEixos = Leitura.lerInt() ;

		return new Utilitario(v.getPlaca(), v.getCor(), v.getNroPortas(), v.getTipoCombustivel(), v.getQuilometragem(), v.getValorDiaria(), capacidadeCarga, nroEixos);
	}

    // Metodos

    public int getCapacidadeCarga()
	{
		return this.capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga)
	{
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getNroEixos()
	{
		return this.nroEixos;
	}

	public void setNroEixos(int nroEixos)
	{
		this.nroEixos = nroEixos;
	}

    // Metodo toString

    public String toString()
	{
		return super.toString() + " | " + this.capacidadeCarga + " | " + this.nroEixos;
	}

}

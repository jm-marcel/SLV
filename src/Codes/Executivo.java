package SLV;/* Programação Orientada a Objetos - N12A (2019_01)
   Alunos - Gabriela dos Reis Bueno   - RA:1771078
            João Marcel Nantes Moreno - RA:2100398
            Luiz Felipe Moralez Amud  - RA:1884921
*/ // Classe Executivo

public class Executivo extends Automovel
{
    // Atributos

    private double vlOpcionais;

    // Metodo Construtor / Criar

    public Executivo (String placa, String cor, int nroPortas, char tipoCombustivel, long quilometragem, double valorDiaria, double vlOpcionais)
	{
        super(placa, cor, nroPortas, tipoCombustivel, quilometragem, valorDiaria);
        this.vlOpcionais = vlOpcionais;
    }

    public static Executivo criar()
	{
		Veiculo v = Automovel.criar();
		System.out.print ("\n\t Digite o valor dos opcionais: ");
		double vlOpcionais = Leitura.lerDouble();

		return new Executivo(v.getPlaca(), v.getCor(), v.getNroPortas(), v.getTipoCombustivel(), v.getQuilometragem(), v.getValorDiaria(), vlOpcionais);
    }
    
    // Metodos

    public double getVlOpcionais()
	{
		return this.vlOpcionais;
	}

    public void setVlOpcionais(double vlOpcionais)
	{
		this.vlOpcionais = vlOpcionais;
	}

	public double calcularCusto(int dias, long km)
	{
		double aux = dias * getValorDiaria();
		aux += this.vlOpcionais;
		return aux;
	}
}

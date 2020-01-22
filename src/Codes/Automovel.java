package Codes;/* Programação Orientada a Objetos - N12A (2019_01)
   Alunos - Gabriela dos Reis Bueno   - RA:1771078
            João Marcel Nantes Moreno - RA:2100398
            Luiz Felipe Moralez Amud  - RA:1884921
*/ // Classe Automovel

public class Automovel extends Veiculo
{
    // Metodo Construtor /  Criar

    public Automovel (String placa, String cor, int nroPortas, char tipoCombustivel, long quilometragem, double valorDiaria)
	{
        super(placa, cor, nroPortas, tipoCombustivel, quilometragem, valorDiaria);
    }

    // Metodos

    public static Veiculo criar() // static
	{
		char tipoCombustivel = '0';

		System.out.print ("\n\t Insira a placa do veiculo: ");
		String placa = Leitura.lerString();

		System.out.print ("\n\t Insira a cor do veiculo: ");
		String cor = Leitura.lerString();

		System.out.print ("\n\t Insira o numero de portas do veiculo: ");
		int nroPortas = Leitura.lerInt();

		System.out.print ("\n\t Insira o tipo de combustivel do veiculo:\n\t Digite G (Gasolina), A (Alchool), D (Diesel) ou E (Etanol): ");

		char aux = Leitura.lerString().charAt(0);

		// do {...} while ((aux == 'G') || (aux == 'A') || (aux == 'D') || (aux == 'E'));

		if((aux == 'G') || (aux == 'A') || (aux == 'D') || (aux == 'E'))
		{
			tipoCombustivel = aux;
		}
		else
		{
			System.out.print ("\n\t Tipo de combustivel inserido indisponivel! ");
		}

		System.out.print ("\n\t Insira a quilometragem do veiculo: ");
		long quilometragem = Leitura.lerLong();

		System.out.print ("\n\t Insira o valor da diaria do veiculo: ");
		double valorDiaria = Leitura.lerDouble();

		return new Veiculo(placa, cor, nroPortas, tipoCombustivel, quilometragem, valorDiaria);
	}
}

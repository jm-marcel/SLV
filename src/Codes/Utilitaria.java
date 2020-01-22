package Codes;/* Programação Orientada a Objetos - N12A (2019_01)
   Alunos - Gabriela dos Reis Bueno   - RA:1771078
            João Marcel Nantes Moreno - RA:2100398
            Luiz Felipe Moralez Amud  - RA:1884921
*/ // Classe Utilitaria

public class Utilitaria
{
    // Atributos

	public static double custoKmExtra = 1.20;
	public static double custoGuia = 250.00;
	public static int idVeiculo = 0;
    public static int idLocacao;
    
    // Metodos

	public static double getCustoKmExtra()
	{
		return custoKmExtra;
	}

	public static void setCustoKmExtra(double custoKmExtra)
	{
		Utilitaria.custoKmExtra = custoKmExtra;
	}

	public static double getCustoGuia()
	{
		return custoGuia;
	}

	public static void setCustoGuia(double custoGuia)
	{
		Utilitaria.custoGuia = custoGuia;
	}

	public static int getIdVeiculo()
	{
		return idVeiculo;
	}

	public static void setIdVeiculo(int idVeiculo)
	{
		Utilitaria.idVeiculo = idVeiculo;
	}

	public static int getIdLocacao()
	{
		return idLocacao;
	}

	public static void setIdLocacao(int idLocacao)
	{
		Utilitaria.idLocacao = idLocacao;
	}

	// Método que valida o CPF

	public static boolean validarCpf(String vAux)
	{
		if (vAux.length() == 11)
		{
			int d1, d2, digito_01, digito_02, resto;
			int digito_CPF;
			String num_Digito_Resultante;

			d1 = d2 = 0;
			digito_01 = digito_02 = resto = 0;

			for (int num_contador = 1; num_contador < vAux.length() - 1; num_contador++)
			{
				digito_CPF = Integer.parseInt (vAux.substring (num_contador - 1, num_contador));
				// Multiplicar a ultima casa por 2, a seguinte por 3, a seguinte por 4 e assim por diante.
				d1 = d1 + (11 - num_contador) * digito_CPF;
				// Para o segundo digito repita o procedimento incluindo o primeiro digito calculado no passo anterior.
				d2 = d2 + (12 - num_contador) * digito_CPF;
			}

			// Primeiro resto da divisão por 11.

			resto = (d1 % 11);

			// Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.

			if (resto < 2) digito_01 = 0;

			else digito_01 = 11 - resto;

			d2 += 2 * digito_01;

			// Segundo resto da divisão por 11.

			resto = (d2 % 11);

			// Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.

			if (resto < 2) digito_02 = 0;

			else digito_02 = 11 - resto;

			// Digito verificador do CPF que está sendo validado.

			String num_Digito_Verificador = vAux.substring (vAux.length() - 2, vAux.length());

			// Concatenando o primeiro resto com o segundo.

			num_Digito_Resultante = String.valueOf(digito_01) + String.valueOf(digito_02);

			// Compara o digito verificador do CPF com o primeiro resto + o segundo resto.

			return num_Digito_Verificador.equals(num_Digito_Resultante);

		}

		return false;
	}

	// Método que valida o CNPJ
	
	public static boolean validarCnpj(String vAux)
	{
		// Rotina para CNPJ:

		if (vAux.length() == 14)
		{
			int soma = 0, digito;
			String calculoCNPJ = vAux.substring(0, 12);
			char[] charCNPJ = vAux.toCharArray();

			// Primeira Parte:

			for (int i = 0; i < 4; i++)
			{
				if (charCNPJ[i] - 48 >= 0 && charCNPJ[i] - 48 <= 9) soma += (charCNPJ[i] - 48) * (6 - (i + 1));
			}

			for (int i = 0; i < 8; i++)
			{
				if (charCNPJ[i + 4] - 48 >= 0 && charCNPJ[i + 4] - 48 <= 9) soma += (charCNPJ[i + 4] - 48) * (10 - (i + 1));
			}

			digito = 11 - (soma % 11);

			calculoCNPJ += (digito == 10 || digito == 11 ) ? "0" : Integer.toString(digito);

			// Segunda Parte:

			soma = 0;

			for (int i = 0; i < 5; i++)
			{
				if (charCNPJ[i] - 48 >= 0 && charCNPJ[i] - 48 <= 9) soma += (charCNPJ[i] - 48) * (7 - (i + 1));
			}

			for (int i = 0; i < 8; i++)
			{
				if (charCNPJ[i + 5] - 48 >= 0 && charCNPJ[i + 5] - 48 <= 9) soma += (charCNPJ[i + 5] - 48) * (10 - (i + 1));
			}

			digito = 11 - (soma % 11);

			calculoCNPJ += (digito == 10 || digito == 1) ? "0" : Integer.toString(digito);

			return vAux.equals (calculoCNPJ);

		}

		return false;

	}

	// Método que valida o CEP

	public static boolean validarCep(String cep)
	{
		int contador = 0;

		if (cep.length() == 9) contador += 1;

		try
		{
			int fon = Integer.parseInt(cep.substring(0, 5));
			contador += 1;

		} catch (NumberFormatException nfe)
		{
			System.out.print("\n\t CEP Invalido! \n");
		}

		try
		{
			int fon = Integer.parseInt(cep.substring(6));
			contador += 1;

		} catch (NumberFormatException nfe)
		{
			System.out.print("\n\t CEP Invalido! \n");
		}

		if (cep.charAt(5) == '-')
		{
			contador += 1;
		}

		if (contador == 4) return true;

		return false;

	}

	// Método que valida o Estado
	
	public static boolean validarEstado(String uf)
	{
		String [] estado = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA",
        "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE",
		"TO"};
		
		for (int i = 0; i < estado.length; i++)
		{
			if (estado[i].equals(uf)) return true;
		}

		return false;

	}

}

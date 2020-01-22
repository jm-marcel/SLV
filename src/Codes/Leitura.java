package Codes;/* Programação Orientada a Objetos - N12A (2019_01)
   Alunos - Gabriela dos Reis Bueno   - RA:1771078
            João Marcel Nantes Moreno - RA:2100398
            Luiz Felipe Moralez Amud  - RA:1884921
*/ // Classe Leitura

import java.io.*;
// import java.util.Scanner;

public class Leitura
{
	public static String lerString()
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(isr);
		String var = "";

		try
		{
			var = buf.readLine();
		}
		catch(IOException erro)
		{
			System.out.println("\n\t Erro \n");
		}

		return var;
	}

	public static int lerInt()
	{
		return Integer.parseInt(lerString());
	}

	public static double lerDouble()
	{
		return Double.parseDouble(lerString());
	}

	public static long lerLong()
	{
		return Long.parseLong(lerString());
	}

}

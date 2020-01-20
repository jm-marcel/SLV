package SLV;/* Programação Orientada a Objetos - N12A (2019_01)
   Alunos - Gabriela dos Reis Bueno   - RA:1771078
            João Marcel Nantes Moreno - RA:2100398
            Luiz Felipe Moralez Amud  - RA:1884921
*/ // Classe Locacao

import java.util.Calendar;
import java.time.temporal.ChronoUnit;

public class Locacao
{
    // Atributos

    private int locacaoID;
    private Cliente cliente;
    private Veiculo veiculo;
    private Calendar dtLocacao;
    private Calendar dtDevolucaoPrevista;
    private Calendar dtDevolucao;
    private long kmLocacao;
    private long kmDevolucao;
    private double valorCaucao;
    private double valorLocacao;
    private boolean paga;

    // Metodo Construtor / Criar

    public Locacao(Cliente cliente, Veiculo veiculo, Calendar dtLocacao, Calendar dtDevolucaoPrevista, Calendar dtDevolucao, long kmLocacao, long kmDevolucao, double valorCaucao, double valorLocacao, boolean paga)
    {
        setLocacaoID();
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.dtLocacao = dtLocacao;
		this.dtDevolucao = dtDevolucao;
		this.dtDevolucaoPrevista = dtDevolucaoPrevista;
		this.kmLocacao = kmLocacao;
		this.kmDevolucao = kmDevolucao;
		this.valorCaucao = valorCaucao;
		this.valorLocacao = valorLocacao;
		this.paga = paga;
    }

    public static Locacao criar()
    {
        // int locacaoID;
        Cliente cliente = new Cliente ("", "", null);
        Veiculo veiculo;
        Calendar dtLocacao;
        Calendar dtDevolucaoPrevista;
        Calendar dtDevolucao;
        long kmLocacao;
        long kmDevolucao;
        double valorCaucao;
        double valorLocacao;
        boolean paga;

        System.out.print("\n\t Cadastrar Cliente: \n");

        System.out.print("\n\t Que tipo de Cliente desejas cadastrar? \n\t 1 para cliente fisico e 2 para cliente juridico: ");
        
        int opcaoCliente = Leitura.lerInt();

		if (opcaoCliente == 1)
		{
			cliente = ClientePF.criar();
		}
		else if (opcaoCliente == 2)
		{
			cliente = ClientePJ.criar();
        }

        Veiculo v[] = new Veiculo[10];
        int qtdVeiculo = 0;
        // int i = 0;

        // do { // Teste 01 - do {...} while (...)

		System.out.print ("\n\t Digite o veiculo desejado: \n");

		System.out.print ("\n\t 1 para Utilitario \n");
		System.out.print ("\n\t 2 para Onibus \n");
		System.out.print ("\n\t 3 para Automovel \n");
        System.out.print("\n\t 4 para Executivo \n");
        
        int escolha = Leitura.lerInt();

        switch (escolha)
		{
		case 1:

			v[qtdVeiculo] = Utilitario.criar();
			qtdVeiculo += 1;
			break;

		case 2:

			v[qtdVeiculo] = Onibus.criar();
			qtdVeiculo += 1;
			break;

		case 3:

			v[qtdVeiculo] = Automovel.criar();
			qtdVeiculo += 1;
			break;

		case 4:

			v[qtdVeiculo] = Executivo.criar();
			qtdVeiculo += 1;
			break;

		default:

			System.out.print("\n\t Numero digitado invalido! ");
			break;

        }
        
        /* System.out.printf("\n - Desejas cadastrar mais algum veiculo?\n - Veiculos Cadastrados [%d/10]:\n", i);
        String opcaoVeiculo = Leitura.lerString();

        i++;

        } while (opcaoVeiculo == 'S' || opcaoVeiculo == 's'); // Teste 01 - do {...} while (...) */

        veiculo = v[qtdVeiculo];

        System.out.print("\n\t Data de locacao: ");
		dtLocacao = Calendar.getInstance();

		dtDevolucaoPrevista = dtLocacao;

		System.out.print("\n\t Quantos dias ainda pretendes ficar com o veiculo? ");
		dtDevolucaoPrevista.add(Calendar.DATE, Leitura.lerInt());

		dtDevolucao = null;

		System.out.print("\n\t Quilometragem atual: ");
		kmLocacao = Leitura.lerLong();

		kmDevolucao = 0;

		System.out.print("\n\t Valor Total: ");
		valorCaucao = Leitura.lerDouble();

		valorLocacao = 0;
		paga = false;

		return new Locacao(cliente, veiculo, dtLocacao, dtDevolucaoPrevista, dtDevolucao, kmLocacao, kmDevolucao, valorCaucao, valorLocacao, paga);
    }

    // Metodos

    public int getLocacaoID()
	{
		return this.locacaoID;
	}

	public void setLocacaoID()
	{
		this.locacaoID = Utilitaria.idLocacao;
		Utilitaria.idLocacao += 1;
	}

	public Cliente getCliente()
	{
		return this.cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

	public Veiculo getVeiculo()
	{
		return this.veiculo;
	}

	public void setVeiculo(Veiculo veiculo)
	{
		this.veiculo = veiculo;
	}

	public Calendar getDtLocacao()
	{
		return this.dtLocacao;
	}

	public void setDtLocacao(Calendar dtLocacao)
	{
		this.dtLocacao = dtLocacao;
	}

	public Calendar getDtDevolucaoPrevista()
	{
		return this.dtDevolucaoPrevista;
	}

	public void setDtDevolucaoPrevista(Calendar dtDevolucaoPrevista)
	{
		this.dtDevolucaoPrevista = dtDevolucaoPrevista;
	}

	public Calendar getDtDevolucao()
	{
		return this.dtDevolucao;
	}

	public void setDtDevolucao(Calendar dtDevolucao)
	{
		this.dtDevolucao = dtDevolucao;
	}

	public long getKmLocacao()
	{
		return this.kmLocacao;
	}

	public void setKmLocacao(long kmLocacao)
	{
		this.kmLocacao = kmLocacao;
	}

	public long getKmDevolucao()
	{
		return this.kmDevolucao;
	}

	public void setKmDevolucao(long kmDevolucao)
	{
		this.kmDevolucao = kmDevolucao;
	}

	public double getValorCaucao()
	{
		return this.valorCaucao;
	}

	public void setValorCaucao(double valorCaucao)
	{
		this.valorCaucao = valorCaucao;
	}

	public double getValorLocacao()
	{
		return this.valorLocacao;
	}

	public void setValorLocacao(double valorLocacao)
	{
		this.valorLocacao = valorLocacao;
	}

	public boolean getPaga()
	{
		return this.paga;
	}

	public void setPaga(boolean paga)
	{
		this.paga = paga;
    }

    public double calcularLocacao()
	{
		int dias = (int) ChronoUnit.DAYS.between(dtDevolucao.toInstant(), dtLocacao.toInstant());
		long km = kmDevolucao - kmLocacao;
		return veiculo.calcularCusto(dias, km);
    }
    
    public boolean paga()
	{
		System.out.print("\n\t Ja foi pago sem nenhuma pendencia?\n\t Digite 'S' ou 'N': \n");

		String resposta;

		resposta = Leitura.lerString();

		switch (resposta)
		{
            case "S":
            this.paga = true;
            
            case "N":
			this.paga = false;
        }
        
        return this.paga;
	}

	public static void listar(Locacao vetorListar[])
	{
		for(int i = 0; i < vetorListar.length; i++)
		{
			System.out.println("\n\t Locacao de nro " + i + ": " + vetorListar[i]);
		}
	}
    
    // Metodo toString

    public String toString()
	{
		return "\n\t Locacao ID: " + this.locacaoID + "\n\t Cliente: " + this.cliente + "\n\t Veiculo: " + this.veiculo + "\n\t Data de Locacao: "
               + this.dtLocacao + "\n\t Data de devolucao prevista: " + this.dtDevolucaoPrevista + "\n\t Data de devolucao: " + this.dtDevolucao +
               "\n\t KM na Locacao: " + this.kmLocacao + "\n\t KM na devolucao: " + this.kmDevolucao + "\n\t Valor do Caucao: " + this.valorCaucao +
               "\n\t Valor da Locacao: " + valorLocacao + "\n\t Foi devolvido e pago?  " + this.paga + "\n";
    }
    
}

package SLV;/* Programação Orientada a Objetos - N12A (2019_01)
   Alunos - Gabriela dos Reis Bueno   - RA:1771078
            João Marcel Nantes Moreno - RA:2100398
            Luiz Felipe Moralez Amud  - RA:1884921
*/ // Classe Main

public class Main
{
	public static void main(String args[])
	{
		int fon = 0, qtdVeiculo = 0, qtdLocacao = 0;
		Veiculo[] v = new Veiculo[10];
        Locacao[] locacaoVetor = new Locacao[10];
    
		while (fon != 1)
		{
            System.out.print ("\n\t CADASTRO E LOCACAO DE VEICULOS \n");
            System.out.print ("\n\t Digite 1 para mostrar os Veiculos cadastrados \n");
            System.out.print ("\n\t Digite 2 para cadastrar Veiculos \n");
            System.out.print ("\n\t Digite 3 para cadastrar Locacoes \n");
            System.out.print ("\n\t Digite qualquer numero diferente de 1, 2 e 3 para encerar o programa \n");

            int escolha = Leitura.lerInt();
      
			switch (escolha)
			{
                case 1:

				if(qtdVeiculo == 0)
				{
                    System.out.print ("\n\t Nenhum veiculo registrado \n");
					continue;
                }
        
				for(int i = 0; i < qtdVeiculo; i++)
				{
					System.out.println(v[i]);
                }
                
                continue;
                
                case 2:

                    System.out.print ("\n\t Digite o tipo de carro desejado \n");

                    System.out.print ("\n\t 1 para Utilitario \n");
                    System.out.print ("\n\t 2 para Onibus \n");
                    System.out.print ("\n\t 3 para Automovel \n");
                    System.out.print ("\n\t 4 para Executivo \n");
                
                int escolha02 = Leitura.lerInt();
        
				switch(escolha02)
				{
                    case 1:
        
					v[qtdVeiculo] = Utilitario.criar();
                    qtdVeiculo += 1;
                    
                    continue;
                    
                    case 2:
        
					v[qtdVeiculo] = Onibus.criar();
                    qtdVeiculo += 1;
                    
                    continue;
                    
                    case 3:
        
					v[qtdVeiculo] = Automovel.criar();
                    qtdVeiculo += 1;
                    
                    continue;
                    
                    case 4:
        
					v[qtdVeiculo] = Executivo.criar();
                    qtdVeiculo += 1;
                    
                    continue;
                    
                    default:

                        System.out.print ("\n\t Numero invalido! \n");
                    
                    continue;
                } 
                
                // continue;
                
                case 3:
                
                locacaoVetor[qtdLocacao] = Locacao.criar();
                qtdLocacao += 1;
                
                continue;
                
                default:

                fon = 1;
                
                break;
        
			}
		}
	}
}

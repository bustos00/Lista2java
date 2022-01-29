import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int nupCalma=0, nuMnervosa=0, nuHagressivo=0, nuOcalmos=0, nuPn40=0,nuPc18=0;
		int sexo, idade, pesonalidade, totalPessoa=0;

		Scanner entrada = new Scanner(System.in);

		while(totalPessoa<=150) {
		
		System.out.println("Entre com sua idade: ");
		idade=entrada.nextInt();

		System.out.println("Entre com seu genero (1-feminino / 2-masculino / 3-Outros): ");
		sexo=entrada.nextInt();
		

		System.out.println("Digite sua caracteristica (1-Pessoa calma /  2-Pessoa nervoso / 3-Pessoa agressivo): ");
		pesonalidade=entrada.nextInt();
		 
		if(sexo==1 && pesonalidade==2)
			nuMnervosa=nuMnervosa+1;
		if(sexo==2 && pesonalidade==3)
			nuHagressivo=nuHagressivo++;
		if(sexo==3 && pesonalidade==1)
			nuOcalmos=nuOcalmos+1;
		if (pesonalidade==1)
			nupCalma=nupCalma++;
		if(pesonalidade==2 && idade>40)
			nuPn40=nuPn40++;
		if(pesonalidade==1 && idade<18)
			nuPc18=nuPc18++;
					
		
		totalPessoa++;
		}
		System.out.println("\n");
		System.out.println("Total de pessoas calamas: "+ nupCalma);
		System.out.println("Total de mulheres nervosas: "+ nuMnervosa);
		System.out.println("Total de homens agressivo: "+ nuHagressivo);
		System.out.println("total de outros calmos: "+ nuOcalmos);
		System.out.println("Totalo de pessoas agressivo com mais de 40 anos: "+ nuPn40);
		System.out.println("Total pessoas calmas com menos de 18 anos: "+ nuPc18);
		}

	}

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int idade, id1=0, id2=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		idade=entrada.nextInt();
		
		while(idade!=-99) {
			
					
			if(idade>=0 && idade<21) {
	
			   id1++;
			}
			if(idade>50) {
			    id2++;	
			}
		
			if(idade<0)
		
			System.out.print("\tPrograma encerrado\nO total de pessoas com menos de 21 anos é: "+ id1 +
                    "\nO total de pessoas com mais de 50 anos é: "+id2);
            idade=entrada.nextInt();
		}
	
	}
}

import java.util.Scanner;

public class Exercicio5 {

		public static void main(String[] args) {
			
			int num, soma=0;
			Scanner leia= new Scanner(System.in);
			
			do{
			System.out.println("Entre com um numero: ");
			num=leia.nextInt();
			soma+=num;
			}	while(num!=0);
			
			System.out.println("Soma=:" + soma);

		}
		
	}



package pacoteAula3_9;
import java.util.Scanner;

public class ClasseAula3_9 {

	public static void main(String[] args) {
		// WHILE 
		char saida = 'N';
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0, contaNumeros = 0;
		while (saida != 'S') {
			System.out.println("Digite um n�mero: ");
			numero = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Gostaria de sair (S - sim, N - N�o)?");
			saida = entrada.next().charAt(0);
			somatorio = somatorio + numero;
			contaNumeros++;
		}
		System.out.printf("O somatorio �: %d \n", somatorio);
		System.out.printf("Foram digitados %d n�meros.", contaNumeros);
	}

}

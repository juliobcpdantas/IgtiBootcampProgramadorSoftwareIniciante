package PacotePraticaIntegradora;

import java.util.Scanner;

public class ClassePraticaIntegradora {

	public static void main(String[] args) {
		Scanner entCaractere = new Scanner(System.in);
		Scanner entNumeros = new Scanner(System.in);
		char operacao = ' ';
		int[] numeros = new int[1000];
		int i = 0, somatorio = 0, contaPares = 0;
		double media = 0;
				
		do {
			System.out.printf("		Menu de opções. \n"
					+ "		D - para digitar novos números.\n"
					+ "		Z - para apresentar o somatório dos números. \n"
					+ "		V - para visualizar todos os números digitados. \n"
					+ "		P - para a quantidade de números digitados. \n"
					+ "		M - para a média simples dos números digitados. \n"
					+ "		Q - para a quantidade de pares. \n"
					+ "		S - para sair do programa. \n");
			operacao = entCaractere.nextLine().charAt(0);
			
			switch (operacao) {
			case 'D':
				System.out.println("Digite o número desejado: ");
				numeros[i] = entNumeros.nextInt();
				i++;
				break;
			case 'Z':
				for (int j = 0; j < i; j++) {
					somatorio = somatorio + numeros[j];
				}
				System.out.printf("O somatório dos números é: %d \n", somatorio);
				break;
			case 'V': 
				for (int j = 0; j < i; j++) {
					System.out.printf("%d \n", numeros[j]);
				}
				break;
			case 'P':
				System.out.printf("Foram digitados %d números. \n", i); //*OK
				break;
			case 'M':
				for (int j = 0; j < i; j++) {
					somatorio = somatorio + numeros[j];
				}
				media = somatorio / i;
				System.out.printf("A média dos numeros digitados é: %.2f \n", media); //*OK
				break;
			case 'Q': 
				for (int j = 0; j < i; j++) {
					if (numeros[j] % 2 == 0)
						contaPares = contaPares + 1;
				}
				System.out.printf("Quantidade de números pares: %d. \n", contaPares);
				break;
			case 'S':
				break;
			default:
				System.out.println("Opção inválida.");
			}
			
		}
		while (operacao != 'S');
		
		System.out.println("Fim da execução.");			
	}

}

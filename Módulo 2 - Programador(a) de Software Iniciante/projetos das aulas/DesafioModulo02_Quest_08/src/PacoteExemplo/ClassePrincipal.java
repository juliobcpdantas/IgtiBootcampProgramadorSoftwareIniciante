package PacoteExemplo;

import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[50];
		int contaNros = 0;
		char continuar = 'S';
		while (continuar == 'S' || continuar == 's') {
			System.out.printf("Digite o %d? n?mero:\n", contaNros+ 1);
			numeros[contaNros] = entrada.nextInt();
			contaNros++;
			entrada.nextLine();
			System.out.println("Deseja continuar digitando n?meros (S - Sim. N - N?o)?");
			continuar = entrada.nextLine().charAt(0);
		}
		for (int i = 0; i < contaNros; i++) {
			if (numeros[i] % 3 == 0 )
			System.out.printf("%d\n", numeros[i]); 
		}
	}
}

package Pacote01;

import java.util.Scanner;

public class Classe01 {

	public static void main(String[] args) {
		int n1 = 0;
		boolean resultado;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro..:");
		n1 = entrada.nextInt();
		
		resultado = (n1 % 2 == 0); //Operação bolleana
		System.out.printf("O número digitado foi: %d.\n O resultado da operação boleana foi: %b", n1, resultado);
	}

}

package PacotePrincipal;

import java.util.Scanner;

public class ClassePrincipal {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int[] numerosDigitados = new int[10];
		int[] numerosFixos = new int[10];
		
	
		for (int i = 0; i < 10; i ++) {
			System.out.printf("Digite o %dº número: \n ", i+1);
				numerosDigitados[i] = ent.nextInt();
				for (int j = 0; j < 10; j ++) {
					numerosFixos[j] = j;
					}
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", numerosDigitados[i], numerosFixos[i],
					numerosDigitados[i]*numerosFixos[i]); 
		}
	}
}

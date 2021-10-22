package pacoteAula3_8;

import java.util.Scanner;

public class classeAula3_8 {

	public static void main(String[] args) {
	//LAÇO -  for (inicialização, condição, incremento)
		int i = 0, j = 0, z = 0;
		
		System.out.println("Inicio. nao vai repetir.");
		for (i = 0; i < 5; i++) {
			System.out.printf("Valor de i: %d. \n", i);
			for (j = 0; j < 3; j++) {
				System.out.printf("	Valor de j: %d. \n", j);
				for (z = 0; z < 2; z++) {
					System.out.printf("		Valor de z: %d. \n", z);
				}
			};
			
		}
		System.out.println("Fim. Não vai repetir.");
		
		

	}

}

package Pacote01;

import java.util.Scanner;
// bug, loop eterno, achar solu��o. 
public class Classe01 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int n = 0;
		int[] valores = new int[3];
		
		System.out.println("Digite um valor para n: ");
		n = ent.nextInt();
		
		while (n >= -1) {
			if (n >= 0 && n <= 10) {
				valores[0] += 1; 
				System.out.printf("Valores[0] �: %d.\n", valores[0]);				
			}
			else if (n >= 11 && n <= 20) {
				valores[1] += 1;
				System.out.printf("Valores[1] �: %d.\n", valores[1]);				
			}
			else {
				valores[2]++;
				System.out.printf("Valores[2] �: %d.\n", valores[2]);
			}
			System.out.println("Digite um valor para n: ");
			n = ent.nextInt(); //<======| Solu��o 
/* 
			 Quando n se enquadra em alguma 
			 condi��o do if, else, as demais condi��es s�o 
			 ignoradas e o c�digo segue para a nova requisi��o 
			 de atribui��o de valor de n
*/
		}
		System.out.printf("Valores entre 0 e 10: %d. \n"
				+ "Valores entre 11 e 20: %d. \n"
				+ "Valores acima de 20: %d.",valores[0], valores[1], valores[2]);
	}
}

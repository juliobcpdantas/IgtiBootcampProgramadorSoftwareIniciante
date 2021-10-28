package Pacote01;

import java.util.Scanner;
// bug, loop eterno, achar solução. 
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
				System.out.printf("Valores[0] é: %d.\n", valores[0]);				
			}
			else if (n >= 11 && n <= 20) {
				valores[1] += 1;
				System.out.printf("Valores[1] é: %d.\n", valores[1]);				
			}
			else {
				valores[2]++;
				System.out.printf("Valores[2] é: %d.\n", valores[2]);
			}
			System.out.println("Digite um valor para n: ");
			n = ent.nextInt(); //<======| Solução 
/* 
			 Quando n se enquadra em alguma 
			 condição do if, else, as demais condições são 
			 ignoradas e o código segue para a nova requisição 
			 de atribuição de valor de n
*/
		}
		System.out.printf("Valores entre 0 e 10: %d. \n"
				+ "Valores entre 11 e 20: %d. \n"
				+ "Valores acima de 20: %d.",valores[0], valores[1], valores[2]);
	}
}

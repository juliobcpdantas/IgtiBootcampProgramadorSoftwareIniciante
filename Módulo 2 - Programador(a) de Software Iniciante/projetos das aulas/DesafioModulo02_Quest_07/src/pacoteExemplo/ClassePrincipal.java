package pacoteExemplo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[50];
		int contaNros = 0;
		char continuar = 'S';
		while (continuar == 'S' || continuar == 's') {
			System.out.printf("Digite o %dº número:\n", contaNros+ 1);
			numeros[contaNros] = entrada.nextInt();
			contaNros++;
			entrada.nextLine();
			System.out.println("Deseja continuar digitando números (S - Sim. N - Não)?");
			continuar = entrada.nextLine().charAt(0);
		}
		try {
			FileWriter arq = new FileWriter("G:\\Cursos\\IgtiBootcampProgramadorSoftwareIniciante\\Módulo 2 - Programador(a) de Software Iniciante\\Desafio M2\\saida.txt");
			PrintWriter gravarArquivo = new PrintWriter(arq);
			for (int i = 0; i < contaNros; i++) {
				gravarArquivo.printf("%d\n", numeros[i]); 
			}
			arq.close();
			gravarArquivo.close();
			System.out.println("Programa Finalizado.");
		}
		catch (IOException e) {
			System.err.println("Erro gravando dados: " + e.getMessage());
		}
	}
}

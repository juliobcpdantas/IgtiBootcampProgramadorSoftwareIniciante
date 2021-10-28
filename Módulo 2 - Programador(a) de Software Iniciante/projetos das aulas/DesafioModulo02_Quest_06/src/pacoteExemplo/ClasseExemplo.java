package pacoteExemplo;
import java.io.*;
import java.util.Scanner;

public class ClasseExemplo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[50]; // [50]
		int contaNros = 0;
		char continuar = 'S';
		while (continuar == 'S' || continuar == 's') {
			System.out.printf("Digite o %dº número:\n", contaNros+ 1);
			numeros[contaNros] = entrada.nextInt();
			contaNros++;
			entrada.nextLine();
			System.out.println("Deseja continuar digitando números (S - Sim. N - Não)?");
			continuar = entrada.nextLine().charAt(0); //while finalizará loop após números[50], mesmo enquanto continuar == s ?? Sim, continuará e dara erro "Index X out of bounds for lenght X"
		}
		try {
			FileWriter arq = new FileWriter("G:\\Cursos\\IgtiBootcampProgramadorSoftwareIniciante\\Módulo 2 - Programador(a) de Software Iniciante\\Desafio M2\\saida3.txt");
			PrintWriter gravarArquivo = new PrintWriter(arq);
			for (int i = 0; i < contaNros; i++) {
				if (numeros[i] % 2 == 0 && numeros[i] > 10 )
					gravarArquivo.printf("%d%n", numeros[i]); // %n ????
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

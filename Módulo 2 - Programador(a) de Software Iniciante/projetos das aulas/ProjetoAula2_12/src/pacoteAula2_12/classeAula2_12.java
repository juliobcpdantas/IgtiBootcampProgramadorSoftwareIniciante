package pacoteAula2_12;

public class classeAula2_12 {

	public static void main(String[] args) {
		// Contadores e Acumuladores
		int notaAtividade = 0, notaTotal = 0;
		System.out.printf("Nota total......: %d. \n", notaTotal);
		
		notaAtividade = 10;
		
		notaTotal = notaTotal + notaAtividade;
		System.out.printf("Nota total......: %d. \n", notaTotal);

		notaAtividade = 30;
		notaTotal += notaAtividade;
		System.out.printf("Nota total......: %d. \n", notaTotal);

		notaAtividade = -3;
		notaTotal = notaTotal + notaAtividade;
		System.out.printf("Nota total......: %d. \n", notaTotal);
		
		
	}

}

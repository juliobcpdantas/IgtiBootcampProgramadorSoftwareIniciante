package pacoteAula2_13;

public class classeAula2_13 {

	public static void main(String[] args) {
		// Prática Integradora
		// requisitos para Aprovação
		
		double nota1, nota2, nota3, nota4, frequencia, totalNotas;
		char statusAluno;
		boolean aprovado;
		String nomeAluno;
		
		nomeAluno = "Ana Paula da Silva Couto";
		statusAluno = 'M';
		
		nota1 = 20;
		nota2 = 20;
		nota3 = 10;
		nota4 = 25;
		
		frequencia = 0.80;
		
		totalNotas = nota1 + nota2 + nota3 + nota4;
		
		aprovado = totalNotas >= 70 && frequencia >= 0.75;
		
		System.out.printf("O(a) aluno(a) %s obteve nota %.2f e frequência %.2f%%. \n A situação do(a) aluno(a) é %c. \n"
				+ "Aluno aprovado? %b", nomeAluno, totalNotas, frequencia*100, statusAluno, aprovado );
	}

}

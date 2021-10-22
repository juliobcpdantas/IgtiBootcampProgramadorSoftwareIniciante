package pacoteAula3_2;

import java.util.*;


public class classeAula3_2 {

	public static void main(String[] args) {
		//if, else
		
		double n1, n2, n3, total, mediaAvaliacoes, frequencia; 
		String situacao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		n3 = entrada.nextDouble();
		
		total = n1 + n2 + n3;
		mediaAvaliacoes	= total / 3;
		
		System.out.println("Digite a frequência do aluno: ");
		frequencia  = entrada.nextDouble();
		
		if (total >= 70 && frequencia >= 0.75) {
			if (total >= 90)
			situacao = "Aprovado com conceito A";
			else if (total >= 80 && total < 90)
			situacao = "Aprovado com conceito B";
			else 
			situacao = "Aprovado com conceito C";
		}
		else if (total >= 40 && total < 70 && frequencia >= 0.75)
			situacao = "Recuperação";
		else
			situacao = "Reprovado";
		
		System.out.printf("O aluno obteve nota total %.2f e média por avaliação de %.2f. A frequência foi %.2f%%. Com isso o aluno está %s.",
				total, mediaAvaliacoes, frequencia*100, situacao);
				
			
		
		
		
				
	}
}

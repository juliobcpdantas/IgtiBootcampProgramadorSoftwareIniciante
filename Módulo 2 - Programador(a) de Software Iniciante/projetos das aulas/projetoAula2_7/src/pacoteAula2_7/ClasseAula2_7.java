package pacoteAula2_7;

public class ClasseAula2_7 {

	public static void main(String[] args) {

		int idade = 30;
		double altura = 1.81;
		String nome = "Joaquin José da Silva";
		boolean estudante = true;
		char sexo = 'M';
		
		// % = Coringa
		// %s = String
		// %d = Int
		// %.4f = float ou double com quatro casa decimais
		// %b = boolean
		// %c caractere (char)

		
		System.out.printf(" A idade é %d e a altura é %.2f.\n O nome é %s e o sexo é %c.\n É estudante? %b"
				, idade, altura, nome, sexo, estudante);
		
		
		
//		System.out.println("idade: " + idade);
//		System.out.print("Altura: " + altura);


		
	}

}

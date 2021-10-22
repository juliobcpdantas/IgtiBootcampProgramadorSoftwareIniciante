package pacoteAula2_10;

public class ClasseAula2_10 {

	public static void main(String[] args) {

		//Operadores Relacionais
		// == 
		// !=
		// >
		// <
		// >=
		// <=
		
		
		int var1 = 10, var2 = 2;
		boolean resultado;
		
		resultado = (var1 == var2);
		
		System.out.printf("A variável var1 é igual a var2? \nResposta: %b", resultado);
		
		//Operadores lógicos 
		// &&	E 
		// || 	OU
		// !	negação  
		
		boolean p, q, s;
		p = false; q = false;
		s = p && q;
		System.out.printf("p: %b; q: %b, s: %b\n", p, q, s);
		
		p = true; q = false;
		s = p && q;
		System.out.printf("p: %b; q: %b, s: %b\n", p, q, s);
		
		p = false; q = true;
		s = p && q;
		System.out.printf("p: %b; q: %b, s: %b\n", p, q, s);
		
		p = true; q = true;
		s = p && q;
		System.out.printf("p: %b; q: %b, s: %b", p, q, s);
		}

}

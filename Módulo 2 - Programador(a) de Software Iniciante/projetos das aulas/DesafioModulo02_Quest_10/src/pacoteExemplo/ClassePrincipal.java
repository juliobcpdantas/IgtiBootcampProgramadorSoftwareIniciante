package pacoteExemplo;

public class ClassePrincipal {

	public static void main(String[] args) {
		int contador = 0;
		for ( int i = 1; i <= 100; i++) {
			System.out.printf("_______ Teste se n�mero %d � primo.______________\n", i);
			contador = 0;
			for (int j = i; j > 0; j--) {
				System.out.printf("	%d dividido por %d tem resto: %d.\n", i, j, i % j);
				if (i % j == 0)
					contador++;
			}
			if (contador == 2)
				System.out.printf("PRIMO|==> %d s� � Divis�vel por 1 e por ele mesmo, logo, � N�mero Primo.\n", i);
		}

	}

}

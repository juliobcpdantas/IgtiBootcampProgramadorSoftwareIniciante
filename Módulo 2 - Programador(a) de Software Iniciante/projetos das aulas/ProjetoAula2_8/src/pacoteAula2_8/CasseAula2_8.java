package pacoteAula2_8;

public class CasseAula2_8 {

	public static void main(String[] args) {
		
		//adi��o
		int n1 = 0, n2 = 0, total = 0;
		n1 = 10;
		n2 = 20;
		total = n1 + n2;
		
		System.out.printf("O resultado de %d + %d = %d \n", n1, n2, total);

		//subtra��o
		n1 = 30;
		n2 = 20;
		total = n1 - n2;
		
		System.out.printf("O resultado de %d - %d = %d \n", n1, n2, total);
		
		//multiplica��o
		n1 = 3;
		n2 = 6;
		total = n1 * n2;
		
		System.out.printf("O resultado de %d multiplicado por %d = %d \n", n1, n2, total);
		
		//divis�o
		double n3, n4, total2;
		n3 = 45;
		n4 = 7;
		total2 = n3 / n4;
		
		System.out.printf("O resultado de %.2f dividido por %.2f = %.4f \n", n3, n4, total2);
		
		//resto da divis�o
		n3 = 83;
		n4 = 3;
		total2 = n3 % n4;
		
		System.out.printf("O resultado de %.2f dividido por %.2f possui resto %.4f \n", n3, n4, total2);
		
		//incremento
		int x = 0;
		System.out.printf("Valor de x: %d \n", x);
		x++;
		System.out.printf("Valor de x: %d \n", x);
		x++;
		System.out.printf("Valor de x: %d \n", x);
		x++;
		System.out.printf("Valor de x: %d \n", x);
		x++;
		System.out.printf("Valor de x: %d \n", x);
		x++;
		System.out.printf("Valor de x: %d \n", x);
		x++;
		
		//decremento
		System.out.printf("Valor de x: %d \n", x);
		x--;
		System.out.printf("Valor de x: %d \n", x);
		x--;
		System.out.printf("Valor de x: %d \n", x);
		x--;
		System.out.printf("Valor de x: %d \n", x);
		x--;
		System.out.printf("Valor de x: %d \n", x);
		x--;
		System.out.printf("Valor de x: %d \n", x);
		x--;
		System.out.printf("Valor de x: %d \n", x);
		x--;
		
		//Precedencia
		
		double a, b, c, d, resultado;
		
		a = 10;
		b = 20;
		c = 30;
		d = 10;
		
		resultado = a + b * c / d;
		System.out.printf("Resultado: %.2f \n", resultado);
					
		
		a = 10;
		b = 20;
		c = 30;
		d = 10;
		
		resultado = (a + b) * c / d;
		System.out.printf("Resultado: %.2f \n", resultado);
	}

}

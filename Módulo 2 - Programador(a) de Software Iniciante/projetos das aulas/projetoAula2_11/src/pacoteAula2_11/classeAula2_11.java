package pacoteAula2_11;

public class classeAula2_11 {

	//Avalia��o de cr�dito - operadores l�gicos
	
	public static void main(String[] args) {
		boolean ult3emprestQuitadosPrazo, possuiRendaComprovada, clienteDezEstrelas, restricaoCredito;
		
		ult3emprestQuitadosPrazo = false;
		possuiRendaComprovada = true;
		clienteDezEstrelas = true;
		restricaoCredito = false;
		
		boolean ConcederEmprestimo = 
				(ult3emprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstrelas) && !restricaoCredito;
		System.out.printf("Emprestimo concedido? \n %b", ConcederEmprestimo);
		
	};
}

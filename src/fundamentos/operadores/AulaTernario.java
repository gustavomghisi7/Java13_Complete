package fundamentos.operadores;

public class AulaTernario {

	public static void main(String[] args) {
		
		double media = 4.6;
		String resultadoFinal = media >= 7.0 ?
				"Aprovado" : "em recupera��o";
		System.out.println("O aluno est� " + resultadoFinal);
		
		double nota = 9.8;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "N�o";
		
		System.out.printf("Tem desconto? %s", resultado);

	}

}

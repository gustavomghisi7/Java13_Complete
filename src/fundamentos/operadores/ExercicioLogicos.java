package fundamentos.operadores;

public class ExercicioLogicos {

	public static void main(String[] args) {
		/* Trabalho na terça (V ou F)
		 * Trabalho na quinta (Vou F)
		 */
		
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = true;
		
		boolean comprouTV50 = trabalhoTerca && trabalhoQuinta;
		System.out.println("Comprou Tv 50? " + comprouTV50);

		boolean comprouTV32 = trabalhoTerca ^ trabalhoQuinta;
		System.out.println("Comprou Tv 32? " + comprouTV32);
		
		boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		
		// Operador Unário
		System.out.println("Mais saudável? " + !comprouSorvete);

	}

}

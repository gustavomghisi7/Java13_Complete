package fundamentos;

public class AulaInferencia {

	public static void main(String[] args) {
		
		double a = 4.5; // declaração e inicialização da variável
		System.out.println(a);
		
		var b = 4.5;
		/* Não é possíver atribuir um texto depois 
		 * de declarar a variável como número.
		 * b = "Algum texto";
		 */ 
		System.out.println(b);
		
		var c = "Texto";
		c = "Outro texto";
		System.out.println(c);
		
		double d; //variável foi declarada
		d = 123; // variável foi inicializada
		System.out.println(d); //variável foi lida

	}

}

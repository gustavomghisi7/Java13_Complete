package fundamentos;

public class AulaInferencia {

	public static void main(String[] args) {
		
		double a = 4.5; // declara��o e inicializa��o da vari�vel
		System.out.println(a);
		
		var b = 4.5;
		/* N�o � poss�ver atribuir um texto depois 
		 * de declarar a vari�vel como n�mero.
		 * b = "Algum texto";
		 */ 
		System.out.println(b);
		
		var c = "Texto";
		c = "Outro texto";
		System.out.println(c);
		
		double d; //vari�vel foi declarada
		d = 123; // vari�vel foi inicializada
		System.out.println(d); //vari�vel foi lida

	}

}

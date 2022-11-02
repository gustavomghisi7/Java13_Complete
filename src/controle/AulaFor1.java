package controle;

public class AulaFor1 {

	public static void main(String[] args) {
		
		for(int contador = 1; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}
		
		
		// Laço infinito
		for(;true;) {
			System.out.println("Fim!");
		}

	}

}

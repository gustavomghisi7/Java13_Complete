package controle;

import java.util.Scanner;

public class AulaDoWhile {

	public static void main(String[] args) {
		
		// if(...) setença; ou bloco{}
		// while(...) setença; ou bloco{}
		// for(...; ...; ...;) setença; ou bloco{}
		
		// do {} while(...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigado!");
		entrada.close();

	}

}

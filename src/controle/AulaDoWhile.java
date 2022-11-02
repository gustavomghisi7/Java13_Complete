package controle;

import java.util.Scanner;

public class AulaDoWhile {

	public static void main(String[] args) {
		
		// if(...) seten�a; ou bloco{}
		// while(...) seten�a; ou bloco{}
		// for(...; ...; ...;) seten�a; ou bloco{}
		
		// do {} while(...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Voc� precisa falar as palavras m�gicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigado!");
		entrada.close();

	}

}

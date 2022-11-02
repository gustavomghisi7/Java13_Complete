package fundamentos;

import java.util.Scanner;

public class ExercicioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite primeiro sal�rio: ");
		String sal1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite segundo sal�rio: ");
		String sal2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite terceiro sal�rio: ");
		String sal3 = entrada.nextLine().replace(",", ".");
		
		double val1 = Double.parseDouble(sal1);
		double val2 = Double.parseDouble(sal2);
		double val3 = Double.parseDouble(sal3);
		
		double media = (val1 + val2 + val3) / 3;
		
		System.out.println("A m�dia dos sal�rios: " + media);
		
		entrada.close();

	}

}

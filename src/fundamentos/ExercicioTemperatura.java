package fundamentos;

public class ExercicioTemperatura {
	
	public static void main(String[] args) {
		
		/* 
		 Fórmula Fahrenheit para Celsius
		 (F - 32) * 5/9 = C
		*/
		
		final int AJUSTE = 32;
		final double FATOR = 5/9.0;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + celsius);
		
		
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + celsius);
		
	}
}

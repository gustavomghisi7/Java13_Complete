package fundamentos.operadores;

public class ExercicioAritmetico {

	public static void main(String[] args) {
		
		double a = Math.pow(6 * (3 + 2), 2);
		double b = 3 * 2;
		double ab = a / b;
		
		double c = ((1 - 5) * (2 - 7) / 2);
		double d = Math.pow(c, 2);
		double cd = d;
		
		double x = ab - cd;
		double z = Math.pow(x, 3);
		double resultado = z / Math.pow(10, 3);
		
		System.out.println(resultado);

	}

}

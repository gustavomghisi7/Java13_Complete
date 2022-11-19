package fundamentos;

public class AulaPrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		String s = new String("Texto");
		s.toUpperCase();
		
		// Wrappers s�o a vers�o objeto dos tipos primitivos!
		int a = 123;
		System.out.println(a);
	}
	
	// byte, short, int, long -> 0
	// float, double -> 0.0
	// boolean -> false
	// char -> '\u0000'

}

package fundamentos;

public class AulaTiposPrimitivos {
	
	public static void main(String[] args) {
		
		// tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542; 
		int id = 567889;
		long pontosAcumulados = 3_134_845_223L;
		
		// tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipo booleano
		boolean estaDeFerias = false; // ou true
		
		// tipo caractere
		char status = 'A'; // ativo
		
		
		
		// dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// n�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// sal�rios
		System.out.println(id + ": ganha -> " + salario);
		
		// f�rias
		System.out.println("Ferias? " + estaDeFerias);
		
		// status
		System.out.println("Status: " + status);
	}

}

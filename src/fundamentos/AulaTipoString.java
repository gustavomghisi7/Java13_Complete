package fundamentos;

public class AulaTipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(0));
		
		String s = "Boa noite";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("NOITE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa noite"));
		System.out.println(s.equalsIgnoreCase("boa noite"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Salario: " + salario);
		
		String maisUmaFrase = "Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Salario: " + salario;
		System.out.println(maisUmaFrase);
		
		
		System.out.printf("Nome: %s %s tem %d e ganha R$ %.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nNome: %s %s tem %d e ganha R$ %.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6, 10));
		


	}

}

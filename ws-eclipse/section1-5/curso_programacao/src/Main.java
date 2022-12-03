import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double exampleNumber = 10.35784;
		
		System.out.println(exampleNumber);
		System.out.print("Hello World!"); // não pula linha
		System.out.println("");
		System.out.printf("%.2f%n", exampleNumber);
		System.out.printf("%.4f%n", exampleNumber); // com separador vírgula
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", exampleNumber); // com separador ponto
		
		System.out.println("Resultado = " + exampleNumber + "");
		System.out.printf("RESULTADO = %.2f metros%n", exampleNumber);
		
		String userName = "Maria";
		int userAge = 31;
		double userIncoming = 4000.0;
		System.out.printf("%s tem %d e ganha R$ %.2f reais%n", userName, userAge, userIncoming);
		
	}

}

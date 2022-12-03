package entrada_dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		double z;
		z = sc.nextDouble(); // Entrada com vírgula se não mudar o Locale
		System.out.println("Você digitou: " + z);
		
		char w;
		w = sc.next().charAt(0); // Somente primeira letra
		System.out.println("Você digitou: " + w);
		
		String a;
		int b;
		double c;
		
		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();
	}

}

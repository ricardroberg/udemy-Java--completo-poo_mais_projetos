package entrada_dados_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt(); // ao apertar ENTER cria uma quebra de linha que consome s1
		sc.nextLine(); // para consumir o ENTER da linha 13
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}


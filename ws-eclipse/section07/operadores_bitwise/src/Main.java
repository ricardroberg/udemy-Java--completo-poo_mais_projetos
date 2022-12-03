import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// & "E" bit a bit (AND)
		// | "OU" bit a bit (OR)
		// ^ "OU-EXCLUSICO" bit a bit (XOR) - ou um, ou outro

		// BIT A BIT (0011010) & (0111101)

		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2); // 24
		System.out.println(n1 | n2); // 125
		System.out.println(n1 ^ n2); // 101
	
	}
}

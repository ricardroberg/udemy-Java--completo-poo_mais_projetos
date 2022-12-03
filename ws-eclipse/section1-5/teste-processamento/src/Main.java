
public class Main {

	public static void main(String[] args) {

//		int x, y;
		int x;
		double y;
		x = 5;
		y = 2 * x;

		System.out.println(x);
		System.out.println(y);

		// AREA TRAPEZIO

		double b, h, B, area;
		b = 6.0;
		h = 5.0;
		B = 8.0;

		area = ((b + B) / 2.0) * h;
		System.out.println("AREA = " + area);

		int a1, b1;
		double resultado;

		a1 = 5;
		b1 = 2;

//		resultado = a1 / b1;
		resultado = (double) a1 / b1;
		System.out.println(resultado); // esperado 2.5, resultado 2.0

		double a2;
		int b2;

		a2 = 5.0;
		// b2 = a2; // Type mismatch: cannot convert from double to int
		b2 = (int) a2;
		System.out.println(b2);

	}

}

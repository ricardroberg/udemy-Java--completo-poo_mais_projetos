
public class Main {

	public static void main(String[] args) {

		double price = 400;

		if (price < 200.00) {
			double discount = price * 0.1;
		}
		
		System.out.println(price);
		// System.out.println(discount); // fora do escopo

	}

}

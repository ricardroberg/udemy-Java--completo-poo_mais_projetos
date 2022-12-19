package entities;

public class CurrencyConverter {
	
	public static double IOF = 0.06;

	public static float dollarToReal (double dollar, double amount) {
		double total = dollar * amount; 
		return (float) (total + (total *IOF));
	}

}

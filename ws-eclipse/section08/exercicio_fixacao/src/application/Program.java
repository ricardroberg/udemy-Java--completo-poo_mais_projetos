package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double dollarPrice, buyQuantity, amountPaid;
		
		System.out.print("What is the dollar price? ");
		dollarPrice = sc.nextFloat();

		System.out.print("How many dollars will be bought? ");
		buyQuantity = sc.nextFloat();
		
		amountPaid = CurrencyConverter.dollarToReal(dollarPrice, buyQuantity);
		System.out.printf("Amount to be paid in reais = %.2f", amountPaid);
		
	}
}

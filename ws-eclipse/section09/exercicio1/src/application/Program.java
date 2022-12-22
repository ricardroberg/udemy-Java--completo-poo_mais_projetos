package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();

		Account newAccount = new Account(accountNumber, accountHolder);

		System.out.print("Is there an initial deposit (Y/n)? ");
		char thereIsDeposit = sc.next().charAt(0);
		if (thereIsDeposit == 'y' || thereIsDeposit == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			newAccount.depositValue(initialDeposit);
		}
		System.out.println();

		System.out.printf("Account data: %n" + newAccount);
		System.out.println();
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		newAccount.depositValue(depositValue);
		System.out.printf("Updated account data: %n" + newAccount);
		System.out.println();
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		newAccount.withdrawValue(withdrawValue);
		System.out.printf("Updated account data: %n" + newAccount);
		System.out.println();

		sc.close();
	}

}

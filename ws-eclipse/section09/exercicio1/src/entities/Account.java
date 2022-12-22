package entities;

public class Account {

	private static double WITHDRAWTAX = 5.00;
	
	private int accNumber;
	private String accHolder;
	private double accBalance;

	public Account(int accNumber, String accHolder) {
		this.accNumber = accNumber;
		this.accHolder = accHolder;
	}
	
	public Account(int accNumber, String accHolder, double initialDeposit) {
		super();
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		depositValue(initialDeposit);
	}

	public int getAccNumber() {
		return accNumber;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public double getAccAmount() {
		return accBalance;
	}

	public void depositValue(double value) {
		this.accBalance += value;
	}

	public void withdrawValue(double value) {
//		if (accAmount < value) {
//			System.out.println("Can´t withdraw!!");
//		} else {
			this.accBalance -= (value + WITHDRAWTAX);
//		}
	}

	public String toString() {
		return "Account " + accNumber + ", Holder: " + accHolder + ", Balance: $ " + String.format("%.2f", accBalance);
	}

}

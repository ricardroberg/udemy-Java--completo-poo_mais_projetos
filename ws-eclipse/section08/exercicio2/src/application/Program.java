package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee1 = new Employee();

		System.out.print("Name: ");
		employee1.name = sc.nextLine();

		System.out.print("Gross salary: ");
		employee1.grossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		employee1.tax = sc.nextDouble();
		System.out.println();
		
		employee1.taxDeduction();

		System.out.println("Employee: " + employee1);
		System.out.println();
		
		System.out.print("Which porcentage to increase salary? ");
		double percentage = sc.nextDouble();
		System.out.println();
		
		employee1.increaseSalary(percentage);
		
		System.out.println("Update data: " + employee1);
		
		sc.close();

	}

}

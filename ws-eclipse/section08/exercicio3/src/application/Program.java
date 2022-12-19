package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student1 = new Student();
		
		student1.name = sc.nextLine();
		student1.grade1 = sc.nextDouble();
		student1.grade2 = sc.nextDouble();
		student1.grade3 = sc.nextDouble();

		student1.showResult();
		
		
		sc.close();
	}

}

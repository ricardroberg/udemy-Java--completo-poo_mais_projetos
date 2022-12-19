package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect;
		rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		double area = rect.area();
		double perimeter = rect.perimeter();
		double diagonal = rect.diagonal();
		
		System.out.println("AREA = " + area);
		System.out.println("PERIMETER = " + perimeter);
		System.out.println("DIAGONAL = " + diagonal);

		
		sc.close();
	}

}

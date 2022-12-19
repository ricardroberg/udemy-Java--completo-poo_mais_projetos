package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

//	public void finalGrade() {
//		double finalGrade = grade1 + grade2 + grade3;
//		String gradeStatus = finalGrade >= 60.0? "PASS" : "FAILED";
//		double missingPoints = finalGrade - 60.0;
//		
//		System.out.printf("FINAL GRADE: %.2f%n", finalGrade);
//		System.out.println(gradeStatus);
//		
//		if(missingPoints < 0)
//			System.out.printf("MISSING %.2f POINTS", Math.abs(missingPoints));
//	}

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public double missingPoints() {
		return finalGrade() - 60.0;
	}

	public String studentStatus() {
		return finalGrade() >= 60.0 ? "PASS" : "FAILED";
	}

	public void showResult() {
		System.out.printf("FINAL GRADE: %.2f%n", finalGrade());
		System.out.println(studentStatus());

		if (missingPoints() < 0)
			System.out.printf("MISSING %.2f POINTS", Math.abs(missingPoints()));
	}
}

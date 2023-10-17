package vectors.ex3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		var sc = new Scanner(System.in);
		
		System.out.print("Type the number of students: ");
		int n = sc.nextInt();
		
		//create vector of students
		Student[] students = new Student[n];
		
		//for to read the object values and to add into vector
		double sum = 0.0;
		
		for (var i = 0; i < students.length; i++) {
			sc.nextLine();//buffer clean
			System.out.printf("Student #%d: %n", i+1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Age: ");
			Integer age = sc.nextInt();
			students[i] = new Student(name, age);
			sum = sum + students[i].getAge();
		}
		
		//avg of ages
		double avg = sum / n;
		System.out.println("Average of ages: " + String.format("%.2f", avg));
		
		sc.close();
	}

}

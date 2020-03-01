package fmi.informatics.list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import fmi.informatics.extending.Student;

public class ListOfStudents{

	public static void main(String[] args) {
		newStudents();
	}
	
	public static void newStudents() {
		Scanner scanner = new Scanner(System.in);
		List<Student> randomStudents = 
				Arrays.asList(
					Student.StudentGenerator.make(),
					Student.StudentGenerator.make(),
					Student.StudentGenerator.make(),
					Student.StudentGenerator.make(),
					Student.StudentGenerator.make()
				);
		System.out.println("Default List");
		randomStudents.forEach((s) -> System.out.println("Name: "+s.getName()+", Age: " + s.getAge()+", EGN: "
				+s.getEgn()+", University: "+ s.getUniversity()+", Speciality: " + s.getSpeciality()));
		
		System.out.println("Please press 1 for ASCENDING ORDER: ");
		try {
			int input = scanner.nextInt();
			if(input==1) {
				System.out.println("Order by University (Ascending)");
				sortStudents(randomStudents);		
				randomStudents.forEach((s) -> System.out.println("Name: "+s.getName()+", Age: " + s.getAge()+", EGN: "
						+s.getEgn()+", University: "+ s.getUniversity()+", Speciality: " + s.getSpeciality()));

			}
			else {
				System.out.println("Default Order");
				randomStudents.forEach((s) -> System.out.println("Name: "+s.getName()+", Age: " + s.getAge()+", EGN: "
						+s.getEgn()+", University: "+ s.getUniversity()+", Speciality: " + s.getSpeciality()));
			}
		} catch (Exception e) {
			System.err.println("Please choose one of the following options!");
		}
			
		if(!(scanner.hasNext())) {
			scanner.close();
		}
	}
	
	public static void sortStudents(List<Student> randomStudents) {
		randomStudents.sort((a, b) -> {
			return a.getUniversity().compareTo(b.getUniversity());
		});
	}
}

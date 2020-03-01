package fmi.informatics.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import fmi.informatics.extending.Student;

public class ListTest {
	List<Student> randomStudents = 
			Arrays.asList(
				new Student(),
				new Student()
			);
	
	public String sort(String one, String two) {
		randomStudents.get(0).setName("Nikolay");
		randomStudents.get(1).setName("Danail");

		randomStudents.sort((a, b) -> {
			return a.getName().compareTo(b.getName());
		});
		return randomStudents.get(0).getName()+randomStudents.get(1).getName();
	}

	@Test
	public void testList() {
		String result = sort(randomStudents.get(0).getName(), randomStudents.get(1).getName());
		String expectedResult = randomStudents.get(0).getName()+randomStudents.get(1).getName();

		assertEquals(expectedResult, result);
	}

	
	@Test
	public void testListFailed() {
		fail("The test failed please try again!");
	}
}
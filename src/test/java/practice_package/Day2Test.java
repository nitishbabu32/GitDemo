package practice_package;

import org.testng.annotations.Test;

public class Day2Test {
	@Test(groups = "Smoke")
public void createStudent() {
	System.out.println("Student is created Succssesfully");
}
	@Test
public void deleteAdmin() {
	System.out.println("Student is deleted Succssesfully");
}
	@Test
public void modifyAdmin() {
	System.out.println("Student is modified succssesfully ");
}
}

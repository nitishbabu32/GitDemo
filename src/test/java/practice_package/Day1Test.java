package practice_package;

import org.testng.annotations.Test;

public class Day1Test {
	@Test(groups = "Smoke")
public void createAdmin() {
	System.out.println("Admin is created Succssesfully");
}
	@Test
public void deleteAdmin() {
	System.out.println("Admin is deleted Succssesfully");
}
	@Test
public void modifyAdmin() {
	System.out.println("Admin is modified succssesfully ");
}
}

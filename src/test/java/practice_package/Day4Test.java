package practice_package;

import org.testng.annotations.Test;

public class Day4Test {
	@Test(groups = "Smoke")
public void createActivites() {
	System.out.println("Activites( is created Succssesfully");
}
	@Test
public void deleteActivites() {
	System.out.println("Activites( is deleted Succssesfully");
}
	@Test
public void modifyActivites() {
	System.out.println("Activites( is modified succssesfully ");
}
}

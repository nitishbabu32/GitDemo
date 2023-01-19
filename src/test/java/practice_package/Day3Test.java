package practice_package;

import org.testng.annotations.Test;

public class Day3Test {
	@Test(groups = "Smoke")
public void createExpensses() {
	System.out.println("Expensses is created Succssesfully");
}
	@Test
public void deleteExpensses() {
	System.out.println("Expensses is deleted Succssesfully");
}
	@Test
public void modifyExpensses() {
	System.out.println("Expensses is modified succssesfully ");
}
}

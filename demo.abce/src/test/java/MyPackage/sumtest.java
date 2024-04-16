package MyPackage;

import static org.junit.Assert.*;
import org.junit.Test;

public class sumtest {

	@Test
	public void test() {
		Addition a=new Addition();
		int actual=a.sum(20,30);
		int expected=50;
		assertEquals(actual,expected);
		System.out.println("test passed");
	}
}
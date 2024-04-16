import static org.junit.Assert.*;
import org.junit.Test;

public class Sum_Test {
	
	@Test
	 public void test()
	 {
		 Sum s=new Sum();
		 int actual=s.sum(2,3);
		 assertEquals(5,actual);
		 System.out.println("Test Passed");
		 
		 
	 }
	@Test
	public void test2()
	{
		Sum s1=new Sum();
		double actual=s1.areaCircle(4);
		assertEquals(50.24,actual,0.0);
		System.out.println("Test2 passed");
	}
}

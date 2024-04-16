import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeandAfter {

	@BeforeClass
	public static void test1() {
		System.out.println("Connect with dbms") ;
	}
	@AfterClass
	public static void test2()
	{
		System.out.println("Dis-Connect with dbms") ;
	}
	@Before
	public void myTest4() {
		System.out.println("My Test4 for before each") ;
	}
	@After
	public void myTest5() {
		System.out.println("My Test4 for after each") ;
	}

	@Test
	public void mytest1() {
		System.out.println("My Test1") ;
	}
	@Test
	public void mytest2() {
		System.out.println("My Test2") ;
	}
	@Test
	public void mytest3() {
		System.out.println("My Test3") ;
	}
}

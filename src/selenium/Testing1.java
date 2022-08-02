package selenium;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Test");
		System.out.println("LogIn");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Test");
		System.out.println("LogOut");
	}

	@Test
	public void test1() {
		//System.out.println("LogIn");
		System.out.println("Test1");//if we have an error in test 1 thn it fail but other test will execute bcz it is in different method
		//System.out.println("LogOut");
	}
	
	@Test
	public void test2() {
		//System.out.println("LogIn");
		System.out.println("Test2");
		//System.out.println("LogOut");
	}
	
	@Test
	public void test3() {
		//System.out.println("LogIn");
		System.out.println("Test3");
		//System.out.println("LogOut");
	}

}

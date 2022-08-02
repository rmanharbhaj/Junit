package selenium;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class Testing3 {
	@Rule
	public ErrorCollector err=new ErrorCollector();

	@Test
	public void test6() {
		String expected="xyz";
		String actual="xyz1";
		System.out.println("Before 1 assert");
		Assert.assertEquals(expected, actual);//we use regular assert in industry
		System.out.println("After 1 assert");
		Assert.assertTrue("Verify 5>3",5>3);
		System.out.println("After 2 assert");
	}
	
	@Test
	public void test7() {
		String expected="xyz";
		String actual="xyz1";
		System.out.println("Before 1 assert");
		
		try {
		Assert.assertEquals(expected, actual);
		}catch(Throwable e) {
			System.out.println(e.getMessage());
			err.addError(e);
		}
		
		System.out.println("After 1 assert");
		
		try {
		Assert.assertTrue("Verify 2>3",2>3);
		}catch(Throwable e) {
			System.out.println(e.getMessage());
			err.addError(e);
		}
		
		System.out.println("After 2 assert");
	}

}

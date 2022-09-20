package Testing;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import dbconnection.Connection1;

public class TestCase1 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(2, 2);
		assertEquals(5,Connection1.calculate(2,3));
	}
	
	@Test(expected = NullPointerException.class)
	
	public void test1() {
		
		String s=null;
		assertEquals("abc", s.toUpperCase());
	}
	
	@After
	public void after() {
		System.out.println("In After");
	}
	
	@Before
	public void before() {
		System.out.println("In Before");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("In After Class");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("In Before Classv");
	}

}

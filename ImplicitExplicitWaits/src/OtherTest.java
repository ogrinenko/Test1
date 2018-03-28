import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//@RunWith(Parameterized.class)

public class OtherTes {

	@BeforeClass
	public static void otherBeforeClass() {
		System.out.println("Other Before Class");
	}
	
	@AfterClass
	public static void otherAfterClass() {
		System.out.println("Other After Class");
	}
	
	
	@Before
	public void setup() {
		System.out.println("Other Before");
	}
	
	
	@Test
	public void test1() {
		System.out.println("Other test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Other test2");
	}
	
	@After
	public void cleanup() {
		System.out.println("Other After");
	}
	
}

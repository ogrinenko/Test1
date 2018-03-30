import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class OtherTest {

	@Parameters
	public static Collection<Object[]> getParams () {
		return Arrays.asList(new Object[][] {{0,0},{1,1}});
	}
	
	private int firstArg;
	private int secondArg;
	
	public OtherTest(int first, int second) {
		this.firstArg = first;
		this.secondArg = second;
	}
	
	
	@BeforeClass
	public static void otherBeforeClass() {
		System.out.println("Other Before Class" );
	}
	
	@AfterClass
	public static void otherAfterClass() {
		System.out.println("Other After Class");
	}
	
	
	@Before
	public void setup() {
		System.out.println("Other Before " + firstArg + " " + secondArg);
	}
	
	
	@Test
	public void test1() {
		System.out.println("Other test1 "  + firstArg + " " + secondArg);
	}
	
	@Test
	public void test2() {
		System.out.println("Other test2 "  + firstArg + " " + secondArg);
	}
	
	@After
	public void cleanup() {
		System.out.println("Other After "  + firstArg + " " + secondArg);
	}
	
}

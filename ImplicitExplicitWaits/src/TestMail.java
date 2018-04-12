
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;


@SuiteClasses({OtherTest.class,test1.class, test2.class, })
@RunWith(Suite.class)
public class TestMail {

	@BeforeClass
	public static void setup() {
		System.out.println("Test Before Class");
	}
	
		
	@AfterClass
	public static void cleanup() {
		System.out.println("Test After Class");
	}
	
	@Test
	public void nothing() {
		System.out.println("Say Hello");
	}
	
	@Test
	public void nothingNew() {
		System.out.println("Say Branch 001");
	}
	
	//Kalidos
	//New Kali

	@Test
	public void nothingAgain() {
		System.out.println("Again you've got nothing");
	}
	
	
}

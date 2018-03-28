import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;


@SuiteClasses({OtherTest.class,test1.class, test2.class, })
@RunWith(Suite.class)
public class TestMaila {

	@BeforeClass
	public static void setup() {
		System.out.println("Test Before Class");
	}
	
		
	@AfterClass
	public static void cleanup() {
		System.out.println("Test After Class");
	}
	
	private List<String> stringList;
	private List<Integer> integerList;
	
}

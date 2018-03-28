import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public  class test {
		
		@BeforeClass
		public static void otherBeforeClass() {
			System.out.println("Test1 Before Class");
		}
		
		@AfterClass
		public static void otherAfterClass() {
			System.out.println("Test1 After Class");
		}
		
		
		@Before
		public void setup() {
			System.out.println("Test1 Before");
		}
		
		
		@Test
		public void test11() {
			System.out.println("Test1 test1");
		}
		
		@Test
		public void test2() {
			System.out.println("Test1 test2");
		}
		
		@After
		public void cleanup() {
			System.out.println("Test1 After");
		}
		
		
		
	}
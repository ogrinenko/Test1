import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public  class test2 {
		
	
		@Before
		public void setup() {
			System.out.println("Test2 Before");
		}
		
		
		@Test
		public void test1() {
			System.out.println("Test2 test1");
		}
		
		@Test
		public void test22() {
			System.out.println("Test2 test2");
		}
		
		@After
		public void cleanup() {
			System.out.println("Test2 After");
		}
		
		
		
	}
	
	
	
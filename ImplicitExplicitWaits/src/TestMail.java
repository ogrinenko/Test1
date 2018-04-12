import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;


@SuiteClasses({OtherTest.class,test1.class, test2.class, })
@RunWith(Suite.class)
public class TestMail {

	static WebDriver driver;
	
	
	@BeforeClass
	public static void setup() {
		System.out.println("Test Before Class");
		System.setProperty("webdriver.chrome.driver", new File("chromedriver.exe").getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = (new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(("//")))));
		
	}
	
		
	@AfterClass
	public static void cleanup() {
		System.out.println("Test After Class");
	}
	
	private List<String> stringList;
	private List<Integer> integerList;

	//Add sting comment
	
	
}

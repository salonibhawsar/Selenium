package maven.part.two;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneTest {

	WebDriver driver = null ;
	@Test
	public void testOne()
	{
		System.out.println("testOne Executed");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		String actualText = driver.findElement(By.id("pah")).getText();
		Assert.assertEquals(actualText,"PracticeAutomationHere");
		//driver.close();
	}
	
	
	@AfterMethod
	public void testClosure()
	{
		driver.close();
	}
}



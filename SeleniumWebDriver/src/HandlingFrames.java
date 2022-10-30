import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.omayo.blogspot.com");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		//Switch to the required frame
		
		WebElement frame = driver.findElement(By.id("iframe2"));
		driver.switchTo().frame(frame) ;
	
		driver.findElement(By.id("q")).sendKeys("Saloni");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("ta1")).sendKeys("tuktuk");
		
		
		//driver.quit();

	}

}

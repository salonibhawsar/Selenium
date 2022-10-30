import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathExpressionDemo {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.omayo.blogspot.com");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		// absolute xpath expressions
		/*
		 * driver.findElement(By .xpath(
		 * "/html/body/div/div/div/div/div/div/div/div/div/div/div/aside/div/div/div/button[@id=\"but2\"]"
		 * )) .click();
		 */

		// relative xpath expressions

		driver.findElement(By.xpath("//button[@id='but2']")).click();
	}

}

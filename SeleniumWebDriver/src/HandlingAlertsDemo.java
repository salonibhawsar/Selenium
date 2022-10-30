import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Handling Alerts
public class HandlingAlertsDemo {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.omayo.blogspot.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("alert1")).click();

		Alert alert = driver.switchTo().alert();

		String str = alert.getText();

		System.out.println(str);

		Thread.sleep(5000);

		alert.accept();

		driver.switchTo().defaultContent();

		driver.quit();

	}
}

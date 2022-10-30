import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenders {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(10000);

		driver.findElement(By.id("form-field-travel_comp_date")).click();

		while (!driver.findElement(By.className("flatpickr-current-month")).getText().contains("December")) {

			driver.findElement(By.className("next")).click();

		}

		List<WebElement> days = driver.findElements(By.xpath("//td[@class='active day' or @class='day']"));

		for (int i = 0; i < days.size(); i++) {

			if (days.get(i).getText().equals("15")) {

				days.get(i).click();
				break;

			}

		}

	}

}
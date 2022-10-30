import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDrpDownAndMultipleSelectionBox {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.omayo.blogspot.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// handling drop down
		driver.findElement(By.id("drop1")).sendKeys("doc 3"); // wrong approch
		
		WebElement dropdownField = driver.findElement(By.id("drop1"));

		Select select = new Select(dropdownField);

		select.selectByVisibleText("doc 3");

		Thread.sleep(3000);
		// handling multiple selection box

		WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));

		Select select1 = new Select(multiSelectionBoxField);

		Thread.sleep(2000);
		select1.selectByVisibleText("Volvo");
		select1.selectByVisibleText("Swift");
		select1.selectByVisibleText("Audi");

		Thread.sleep(3000);

		driver.quit();
	}

}

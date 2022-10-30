import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INDIAN\\eclipse-workspace\\PractiseSelenium\\\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/"); // instagram
																	// page
		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("tuktuk_._._");

		Thread.sleep(3000);

		// driver.findElement(By.tagName("div")).submit();

		// driver.close();*/
	}

}

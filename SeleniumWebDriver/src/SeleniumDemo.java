import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {

		// Chrome Driver is a predefined class of selenium webdriver library
		// We are creating object og chromedriver class
		// we are assigning that object to webDriver
		// WebDriver is an Interface of Selenium
		// ChromeDriver is an child class of WebDriver Interface
		// ChromeDriver() -> Constructor

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

}





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverAPICommandsDemoOne {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");

		// A blanck chrome browser will be launched
		WebDriver drivers = new ChromeDriver();

		// The provided URL will be opened in the above browser ==> get(URL)
		drivers.get("http://www.omayo.blogspot.com");

		// MAximizing the browser window ==>manage().window().maximize()

		drivers.manage().window().maximize();

		// 1) Finding the UI Element by Id

		/// WebElement element = drivers.findElement(By.id("confirm"));

		// Click on the confirm button
		/// element.click();

		// 2) Finding the UI Element by name
		// WebElement elementbyname = drivers.findElement(By.name("q"));

		// Using sendkeys we can simulate typing into an element which may set its value
		// elementbyname.sendKeys("Saloni Bhawsar");

		// 3)Clear the field --- clear()

		// WebElement elementbyname = drivers.findElement(By.id("textbox1"));;

		// hold the execution for 5 seconds for demonstration purpose

		/*
		 * Thread.sleep(5000); elementbyname.clear(); Thread.sleep(5000);
		 * elementbyname.sendKeys("Saloni Bhawsar");
		 */

		// $4) Finding the ui elements using the class name

		/*
		 * WebElement elementbyname = drivers.findElement(By.className("classone"));
		 * Thread.sleep(5000); elementbyname.sendKeys("Check the field by classname");
		 */

		// 5)using linktext => it is for hyperlink and partiallinkText() ==> here , we
		// are able to give small name of hyperlink text

		// WebElement elementbyname = drivers.findElement(By.linkText("compendiumdev"));

		/*
		 * WebElement elementbyname =
		 * drivers.findElement(By.partialLinkText("compend"));
		 * 
		 * Thread.sleep(5000);
		 * 
		 * elementbyname.click();
		 */

		// 6) Using css selector

		/*
		 * WebElement elementbyname = drivers.findElement(By.cssSelector("#confirm"));
		 * Thread.sleep(2000); elementbyname.click();
		 */

		// 7) by using xpath

	//	drivers.findElement(By.xpath("//input[@id='alert1']")).click();

		// Retrieve the text from the UI

		String text =drivers.findElement(By.id("pah")).getText();
		
		System.out.println(text);

	}

}

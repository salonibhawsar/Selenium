import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//getWindowHandle() and switchTo() ==== for handling windosws
public class WindowHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Open a popup window")).click();

		// getWindowHandles() ---> Used to retrieve all the ids of the currently opened
		// windows .

		Set<String> windowids = driver.getWindowHandles();

		Iterator<String> itr = windowids.iterator();
		/*
		 * while (itr.hasNext()) { String windowId = itr.next();
		 * System.out.println("Window id is :" + windowId); }
		 */

		String mainWindowId = itr.next();
		String childWindowId = itr.next();

		// switchTo () --> Used to switch between different windows when multiple
		// windows are opened by using the ids of the currently opened windows which are
		// returned by

		// Here , we switch the focus of selenium from main window to the child window
		driver.switchTo().window(childWindowId);

		System.out.println("");
		String firstParaOfChildWindow = driver.findElement(By.id("para1")).getText();
		System.out.println("The first paragraph of the child window is :" + firstParaOfChildWindow);

		System.out.println("");
		String secondParaOfChildWindow = driver.findElement(By.id("para2")).getText();
		System.out.println("The second paragraph of the child window is :" + secondParaOfChildWindow);

		// again if we want to switch to the main window just use main window id

		driver.switchTo().window(mainWindowId);
		driver.quit();
	}

}

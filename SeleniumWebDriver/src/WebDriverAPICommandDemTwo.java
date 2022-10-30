import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverAPICommandDemTwo {

	public static void main(String[] args) throws InterruptedException {

		// setup for chrome
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // here chrome browser will be launch

		// setup for firefox
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\geckodriver.exe"
		 * );
		 * 
		 * WebDriver driver = new FirefoxDriver();
		 */

		// setup for internet explorer

		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\IEDriverServer.exe"
		 * ); WebDriver driver = new InternetExplorerDriver();
		 */

		driver.get("http://omayo.blogspot.com/"); // here the particular url website will be launch
		driver.manage().window().maximize(); // here we maximize the default minimized window

		// 8) getTitle() -->

		String title = driver.getTitle();
		System.out.println("The title of the page is :" + title);
		System.out.println("");

		// 9) get current url og the page
		Thread.sleep(3000);
		String currenturl = driver.getCurrentUrl();
		System.out.println("The current url of above page is :" + currenturl);

		/*
		 * driver.findElement(By.cssSelector(
		 * "body.variant-simplysimple:nth-child(2) div.content:nth-child(4) div.content-outer div.fauxborder-left.content-fauxborder-left div.content-inner div.main-outer:nth-child(3) div.fauxborder-left.main-fauxborder-left div.region-inner.main-inner div.columns.fauxcolumns div.columns-inner:nth-child(4) div.column-right-outer div.column-right-inner div.sidebar.section:nth-child(1) div.widget.LinkList:nth-child(11) div.widget-content:nth-child(2) ul:nth-child(1) li:nth-child(1) > a:nth-child(1)"
		 * )) .click();
		 * 
		 * String currenturl1 = driver.getCurrentUrl();
		 * System.out.println("The current url of above page is :" + currenturl1);
		 */

		// 10) close() --> used to close current browser

		// driver.close();

		// 11) quit() --. its better than close()

		/*
		 * driver.findElement(By.cssSelector(
		 * "body.variant-simplysimple:nth-child(2) div.content:nth-child(4) div.content-outer div.fauxborder-left.content-fauxborder-left div.content-inner div.main-outer:nth-child(3) div.fauxborder-left.main-fauxborder-left div.region-inner.main-inner div.columns.fauxcolumns div.columns-inner:nth-child(4) div.column-right-outer div.column-right-inner div.sidebar.section:nth-child(1) div.widget.LinkList:nth-child(11) div.widget-content:nth-child(2) ul:nth-child(1) li:nth-child(1) > a:nth-child(1)"
		 * )) .click();
		 * 
		 * Thread.sleep(5000); driver.quit();
		 */

		// 12) getattribute() -->

		System.out.println("");
		String atttr = driver.findElement(By.name("fname")).getAttribute("value");
		System.out.println("The value inside the field is:" + atttr);

		// 13) isDisplayed()

		System.out.println("");
		Boolean display = driver.findElement(By.id("but2")).isDisplayed();
		System.out.println("Button is displayed on the page : " + display);
		Boolean display1 = driver.findElement(By.id("hbutton")).isDisplayed();
		System.out.println("Button is displayed on the page : " + display1);

		// 14) isEnabled()

		System.out.println("");
		Boolean enable = driver.findElement(By.id("but2")).isEnabled();
		System.out.println("Button is enbale on the page : " + enable);
		Boolean enable1 = driver.findElement(By.id("but1")).isEnabled();
		System.out.println("Button is enable on the page : " + enable1);

		// 15) isSelected()
		System.out.println("");

		Boolean selected = driver.findElement(By.id("checkbox1")).isSelected();
		System.out.println("The checkout is Selected :" + selected);
		Boolean selected1 = driver.findElement(By.id("checkbox2")).isSelected();
		System.out.println("The checkout is Selected :" + selected1);

		// 16) navigaet() -> Used to perform navigation operations

		driver.navigate().to("https://www.google.com"); // This and get() works same
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		/*
		 * driver.navigate().forward(); Thread.sleep(2000); driver.navigate().refresh();
		 * Thread.sleep(2000);
		 */

		// 17) getPageSource() --> retriving the source code of current page

		String sc = driver.getPageSource();
		System.out.println("");
		System.out.println("The sourcecode of the current page is :" + sc);

		// 18) submit() --> for submitting a form

		driver.navigate().to("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		driver.navigate().back();
		// driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/label[1]/input[1]")).sendKeys("tuktuk_._._");
		// driver.findElement(By.name("password")).sendKeys("$mahakal");
		// driver.findElement(By.xpath("1")).submit();

		// 19) getTegName() --> finding the tagvalue

		String tagName = driver.findElement(By.id("but2")).getTagName();
		System.out.println("tagname is :" + tagName);

		// 20) cssValue() --? finding the css value

		/*
		 * String css = driver.findElement(By.id("home")).getCssValue("text-align");
		 * System.out.println("The css value is :" + css);
		 */
		// 21) getSize() --- finding the size of element

		Dimension d = driver.findElement(By.id("but2")).getSize();
		System.out.println("The size is :" + d);

		// 22)getLocation()-- finding the location of element

		Point p = driver.findElement(By.id("but2")).getLocation();
		System.out.println("The location is :" + p);

		// 23)fullscreen() -- opning the application i full screen mode

		driver.manage().window().fullscreen();

		// 24) findElements() --

		List<WebElement> l = driver.findElements(By.tagName("a"));

		for (int i = 0; i <= l.size(); i++) {
			System.out.println("Here , the list of tagname are :" + l.get(i).getText());

		}
		// 25) by,tagName() --- ||above
		Thread.sleep(3000);
		driver.quit();

	}

}

package com.rahulshetty.assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		// count number of links in page

		System.out.println(driver.findElements(By.tagName("a")).size());

		// count number of links in footer section

		WebElement footerdriver = driver.findElement(By.cssSelector("#gf-BIG")); // limiting web drivers
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// links count of only frst coulmn

		WebElement frstcoulmndriver = footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));

		System.out.println(frstcoulmndriver.findElements(By.tagName("a")).size());

		// click on each link in the column

		// 4- click on each link in the coloumn and check if the pages are opening-
		for (int i = 1; i < footerdriver.findElements(By.tagName("a")).size(); i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			footerdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);

		}
		// opens all the tabs
		Set<String> abc = driver.getWindowHandles();// 4
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

		driver.quit();
	}

}

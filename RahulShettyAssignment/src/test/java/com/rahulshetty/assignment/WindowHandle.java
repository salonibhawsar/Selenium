package com.rahulshetty.assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");

		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("a[href='/windows']")).click();

		driver.findElement(By.cssSelector("a[href*='windows']")).click();

		Set<String> abc = driver.getWindowHandles();

		Iterator<String> it = abc.iterator();

		String parentWindow = it.next();

		driver.switchTo().window(it.next());

		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

		driver.switchTo().window(parentWindow);

		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

		driver.quit();
	}

}

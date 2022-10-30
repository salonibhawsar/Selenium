package com.rahulshetty.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("checkBoxOption1")).click();

		Assert.assertTrue(driver.findElement(By.name("checkBoxOption1")).isSelected());
		Thread.sleep(3000);

		driver.findElement(By.name("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.name("checkBoxOption1")).isSelected());
		Thread.sleep(3000);

		// Count the number of checkboxes

		List<WebElement> countedCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		System.out.println(countedCheckBoxes.size());

		driver.quit();
	}

}

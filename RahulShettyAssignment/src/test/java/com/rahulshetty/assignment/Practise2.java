package com.rahulshetty.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		// 1 . select any chckbox and grab the text

		driver.findElement(By.cssSelector("#checkBoxOption2")).click();

		String grabbed = driver.findElement(By.cssSelector("label[for='benz']")).getText();

		System.out.println(grabbed);

		// 2. select dropdown as per the dropdown option number

		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));

		s.selectByVisibleText(grabbed);

		// 3. enter grabbed text into the text box

		driver.findElement(By.name("enter-name")).sendKeys(grabbed);

		// 4. click on alert and verify if grabbed text prsnt on alert or not

		driver.findElement(By.id("alertbtn")).click();
		String alertMsg = driver.switchTo().alert().getText();
		//driver.findElement(By.id("confirmbtn")).click();
		System.out.println(alertMsg);
		
		if(alertMsg.contains(grabbed))
		{
			System.out.println("Execution Successful");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}

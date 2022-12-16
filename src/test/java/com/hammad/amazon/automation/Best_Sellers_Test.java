package com.hammad.amazon.automation;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Best_Sellers_Test {
	private static WebDriver driver;
	@BeforeClass
	public static void launch_Amazon() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//Launch website
		driver.navigate().to("https://www.amazon.in");
		 //Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@Test
	public void goToBestSellers() throws Exception {
		// Click on Best Sellers
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
		Thread.sleep(5000);

}
	@Test
	public void goToAmazon_Launchpad() throws Exception {
		// Click on Amazon Launchpad
		driver.findElement(By.xpath("//*[@id=\"CardInstanceGLaGP5VwiGIEz4uGjn7DIw\"]/div[2]/div[1]/a")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		}
	@Test
	public void goToBooks() throws Exception {
		// Click on Amazon Launchpad
		driver.findElement(By.xpath("//*[@id=\"CardInstanceGLaGP5VwiGIEz4uGjn7DIw\"]/div[2]/div[7]/a")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		}
	@AfterClass
	public static void closed_driver()throws Exception{
		Thread.sleep(5000);
		driver.close();
		
	}
	}

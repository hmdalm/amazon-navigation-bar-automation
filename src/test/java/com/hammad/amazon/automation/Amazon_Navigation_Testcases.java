package com.hammad.automation.amazon;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Navigation_Testcases {
	private static WebDriver driver;
	@BeforeClass
	public static void launch_Amazon() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//Launch website
		driver.navigate().to("https://www.amazon.in/");
		 //Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@Test
	public void goToBestSellers() throws Exception {
		// Click on Best Sellers
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
		Thread.sleep(5000);
	
		}
	
	@Test
	public void goToMobiles() throws Exception {
		// Click on Mobiles
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
		Thread.sleep(5000);
		
	}
	@Test
	public void goToTodaysDeal() throws Exception{
		// Click on today's Deals
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
		Thread.sleep(5000);
				
	}
	@Test
public void goToCustomerService() throws Exception {
		// Click on Customer Service
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
	Thread.sleep(5000);
}
	@Test
public void goToElectronics() throws Exception {
		// Click on Electronics
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
	Thread.sleep(5000);
	}
	@Test
public void goToFashion() throws Exception {
		// Click on Fashion
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();
	Thread.sleep(5000);
	}
	
	@Test
public void goToHomeKitchen() throws Exception {
		// Click on Home & Kitchen
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).click();
	Thread.sleep(5000);
	}
	@Test
public void goToNewReleases() throws Exception {
		// Click on New Releases
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[9]")).click();
	Thread.sleep(5000);
	}
@AfterClass
public static void closed_driver()throws Exception {
	Thread.sleep(8000);
	driver.close();
	
}

}

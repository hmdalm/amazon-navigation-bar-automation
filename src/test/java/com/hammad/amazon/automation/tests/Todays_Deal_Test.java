package com.hammad.amazon.automation.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hammad.amazon.automation.utility.NavigationUtility;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Todays_Deal_Test {
	private static WebDriver driver;
	static int index=-1;
	@BeforeClass
	public static void launch_Amazon() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium webdrivers\\108\\chromedriver.exe");
		driver = new ChromeDriver();
		//Launch website
		driver.navigate().to("https://www.amazon.in");
		 //Maximize the browser
		driver.manage().window().maximize();
		String headerText = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]")).getText();
		index = NavigationUtility.getItemPosition(headerText,"Today's Deals");
		Thread.sleep(1000);
	}
	
	@Test
	public void TestA_TodaysDeal() throws Exception {
		// Click on Today's Deal
 		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a["+index+"]")).click();
		Thread.sleep(5000);

}
	@Test
	public void TestB_All_Deals() throws Exception {
		// Click on Today's Deal
		driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[1]/a/span[2]")).click();
		Thread.sleep(2000);

}
	@Test
	public void TestC_AddItem() throws Exception {
		// Click on Item
		driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[1]")).click();
		Thread.sleep(2000);
		//Add item into cart
		driver.findElement(By.xpath("//*[@id=\"ProductGrid-ZWmeOBH\"]/div/div/div/div/div[1]/ul/div/div[1]/div[1]/div/div[3]/div[9]/div[2]/button")).click();
	}
	@AfterClass
	public static void closed_driver()throws Exception{
		Thread.sleep(5000);
		driver.close();
		
	}
	}



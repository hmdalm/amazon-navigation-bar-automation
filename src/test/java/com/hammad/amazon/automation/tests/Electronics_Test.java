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
public class Electronics_Test {
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
		index = NavigationUtility.getItemPosition(headerText,"Electronics");
		Thread.sleep(1000);
	}
	@Test
	public void testA_goToElectronics() throws Exception {
		
		NavigationUtility.openItem(driver, index);	
		Thread.sleep(3000);
	}
	@Test
	public void testB_goToAccessories() throws Exception {
driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[2]/span/a/span")).click();
	}
	@Test
	public void testC_Brandfilter_Use() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[5]/ul/li[4]/span/a/div/label/i")).click();
	}
	@AfterClass
	public static void closed_driver()throws Exception{
		Thread.sleep(5000);
		driver.close();
		
	}
	
}

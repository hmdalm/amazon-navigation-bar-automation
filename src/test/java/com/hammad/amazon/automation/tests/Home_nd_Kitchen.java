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
public class Home_nd_Kitchen {
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
		index = NavigationUtility.getItemPosition(headerText,"Home & Kitchen");
		Thread.sleep(1000);
	}
	@Test
	public void testA_goToHome_nd_Kitchen() throws Exception {
		
		NavigationUtility.openItem(driver, index);	
		Thread.sleep(3000);
	}
	@Test
	public void testB_goToBedroom() throws Exception {
		driver.navigate().to("https://www.amazon.in/gp/browse.html?rw_useCurrentProtocol=1&node=10892566031&ref_=amb_link_hwyI9AQpTE2eQbfSoqk3Ng_2");
		Thread.sleep(2000);
	}
	@Test
	public void testB_goTokitchen() throws Exception {
		driver.navigate().to("https://www.amazon.in/gp/browse.html?rw_useCurrentProtocol=1&node=10892567031&ref_=amb_link_hwyI9AQpTE2eQbfSoqk3Ng_3");
		Thread.sleep(2000);
	}
	@Test
	public void testC_goToHomeDecor() throws Exception {
		driver.navigate().to("https://www.amazon.in/gp/browse.html?rw_useCurrentProtocol=1&node=1380374031&ref_=amb_link_hwyI9AQpTE2eQbfSoqk3Ng_8");
		Thread.sleep(2000);
	}
	@Test
	public void testD_ConsoleMirrors() throws Exception {
		driver.navigate().to("https://www.amazon.in/gp/browse.html?rw_useCurrentProtocol=1&node=1380410031&ref_=amb_link_y8Lav9K-OFaQdAiiKUCZBg_32");
		Thread.sleep(2000);
	}
	@AfterClass
	public static void closed_driver()throws Exception{
		Thread.sleep(5000);
		driver.close();
		
	}
}

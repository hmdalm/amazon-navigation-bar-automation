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
public class Best_Sellers_Test {
	private static WebDriver driver;
	static int index = -1;

	@BeforeClass
	public static void launch_Amazon() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium webdrivers\\108\\chromedriver.exe");
		driver = new ChromeDriver();
		// Launch website
		driver.navigate().to("https://www.amazon.in");
		// Maximize the browser
		driver.manage().window().maximize();
		String headerText = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]")).getText();
		index = NavigationUtility.getItemPosition(headerText, "Best Sellers");
		Thread.sleep(1000);
	}

	@Test
	public void testA_goToBestSellers() throws Exception {
		// Click on Best Sellers
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a["+index+"]")).click();
		
		Thread.sleep(3000);

	}

	@Test
	public void testB_goToAmazon_Launchpad() throws Exception {
		// Click on Amazon Launch pad

		driver.navigate().to("https://www.amazon.in/gp/bestsellers/boost/ref=zg_bs_nav_0");
		Thread.sleep(5000);
		driver.navigate().back();
	}

	@Test
	public void testC_goToBooks() throws Exception {
		// Click on Books

		driver.navigate().to("https://www.amazon.in/gp/bestsellers/books/ref=zg_bs_nav_0");
		Thread.sleep(5000);
		driver.navigate().back();
	}

	@Test
	public void testD_goToCar_nd_Motorbike() throws Exception {
		// Click on Books

		driver.navigate().to("https://www.amazon.in/gp/bestsellers/automotive/ref=zg_bs_nav_0");
		Thread.sleep(5000);
		driver.navigate().back();
	}

	@AfterClass
	public static void closed_driver() throws Exception {
		Thread.sleep(5000);
		driver.close();

	}
}

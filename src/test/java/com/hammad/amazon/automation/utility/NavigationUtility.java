package com.hammad.amazon.automation.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationUtility {

	public static int getItemPosition(String headerText, String itemName) {
		
		int itemIndex=-1;
	
		String[] splittedHeaderArray=headerText.split("\n");
		for (int i = 0; i < splittedHeaderArray.length; i++) {
			if(splittedHeaderArray[i].equals(itemName)) {
				itemIndex=i;
			}
		}
		
		return itemIndex;
	
	}
	
	public static void openItem(WebDriver webdriver , int index) {
		webdriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a["+index+"]")).click();

	}
}

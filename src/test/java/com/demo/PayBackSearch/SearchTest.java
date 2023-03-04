package com.demo.PayBackSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.demo.PayBack.Searchpagefactory;

public class SearchTest {
	WebDriver driver=null;
  @Test
  public void search() throws InterruptedException {
	    System.setProperty("Webdriver.chrome.driver","‪chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.payback.in/rewards");
		driver.manage().window().maximize();
		
  Searchpagefactory top=new Searchpagefactory(driver);

  top.Iwishto();
  Thread.sleep(1000);
  top.selectEarnPointsOption();
  Thread.sleep(1000);
//  top.Iwishto();
//  Thread.sleep(1000);
//  top.redeempointsoption();
//  Thread.sleep(1000);
  top.clickSearchButton();
  Thread.sleep(1000);
  top.checkbox();
  Thread.sleep(1000);
  top.sorting();
  Thread.sleep(1000);
  
 }
}
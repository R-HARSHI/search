package com.demo.PayBackSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.demo.PayBack.Searchpagefactory;

public class SearchtestNG {
	
  @Test(priority=0)
  public void Iwishto() throws InterruptedException {
	    System.setProperty("Webdriver.chrome.driver","‪chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.payback.in/rewards");
		driver.manage().window().maximize();
		Searchpagefactory top=new Searchpagefactory(driver);
		top.Iwishto();
		Thread.sleep(1000);
		driver.close();
  }
  @Test(priority=1)
  public void selectEarnPointsOption() throws InterruptedException  
  {
	   System.setProperty("Webdriver.chrome.driver","‪chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.payback.in/rewards");
	   driver.manage().window().maximize();
	   Searchpagefactory top=new Searchpagefactory(driver);
	   top.Iwishto();
	   Thread.sleep(1000);
	   top.selectEarnPointsOption();
	   Thread.sleep(1000);
	   driver.close();
  }
  @Test(priority=2)
  public void clickSearchButton() throws InterruptedException {
	   System.setProperty("Webdriver.chrome.driver","‪chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.payback.in/rewards");
	   driver.manage().window().maximize();
	   Searchpagefactory top=new Searchpagefactory(driver);
	   top.Iwishto();
	   Thread.sleep(1000);
	   top.selectEarnPointsOption();
	   Thread.sleep(1000);
	   top.clickSearchButton();
	   Thread.sleep(1000);
	   driver.close();
  }
  @Test(priority=3)
  public void checkbox() throws InterruptedException {
	   System.setProperty("Webdriver.chrome.driver","‪chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.payback.in/rewards");
	   driver.manage().window().maximize();
	   Searchpagefactory top=new Searchpagefactory(driver);
	   top.Iwishto();
	   Thread.sleep(1000);
	   top.selectEarnPointsOption();
	   Thread.sleep(1000);
	   top.clickSearchButton();
	   Thread.sleep(1000);
	   top.checkbox();
	   Thread.sleep(1000);
	   driver.close();
  }
  @Test(priority=4)
  public void sorting() throws InterruptedException
  {
	   System.setProperty("Webdriver.chrome.driver","‪chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.payback.in/rewards");
	   driver.manage().window().maximize();
	   Searchpagefactory top=new Searchpagefactory(driver);
	   top.Iwishto();
	   Thread.sleep(1000);
	   top.selectEarnPointsOption();
	   Thread.sleep(1000);
	   top.clickSearchButton();
	   Thread.sleep(1000);
	   top.sorting();
	   Thread.sleep(1000);
	   driver.close();
  }
}

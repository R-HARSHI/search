package com.demo.PayBack;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpagefactory {
	
	WebDriver driver=null;
	
	@FindBy(xpath = "//span[contains(text(),'I wish to')]")
	WebElement iWishToDropdown;
	
	@FindBy(xpath = "//a[@href='#earn']")
	WebElement earnPointsOption;
	
//	@FindBy(xpath = "//a[@href='#redeem']")
//	WebElement redeemPoints;
	
	@FindBy(xpath = "//input[@placeholder='Search for product & deals']")
    WebElement searchbar;
	
	//@FindBy(xpath = "//input[@id='filter_index_0']")
	//WebElement Brands;
	
	//@FindBy(xpath ="//div[@class='pb-back-top']]")
	//WebElement sortby;
	
	@FindBy(xpath="//span[@id='sort_concept']")
	WebElement Pricelow;
	
	
    public Searchpagefactory (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void Iwishto() throws InterruptedException {
    	
    iWishToDropdown.click();
    Thread.sleep(1000);
    }
    public void selectEarnPointsOption() throws InterruptedException  
    {
    earnPointsOption.click();
     Thread.sleep(1000);
     
    }
   // driver.navigate().to("https://www.payback.in/");
    //iWishToDropdown.click();
   // Thread.sleep(1000);
   // redeemPoints.click();
   // Thread.sleep(1000);
//    public void redeempointsoption() throws InterruptedException
//    {
//    	redeemPoints.click();
//    	Thread.sleep(1000);
//    }
    public void clickSearchButton() throws InterruptedException {
    searchbar.sendKeys("Laptop");
    Actions act = new Actions(driver);
    act.sendKeys(Keys.ENTER).build().perform();
   // driver.findElement(By.xpath("//div[@class='pb-check']")).click();
    Thread.sleep(15000);
    }
    public void checkbox() throws InterruptedException {
     driver.findElement(By.xpath("//*[@id=\"other_brands\"]")).click();
    Thread.sleep(1000);
    }
    public void sorting() throws InterruptedException
    {
    	driver.findElement(By.xpath("//span[@id='sort_concept']")).click();
    	Thread.sleep(1000);
    	//driver.findElement(By.xpath("(//span[@id='sort_concept'])[1]")).click();
        
        
    }
   
  

}
   // public void selectEarnPointsOption() {
      //  earnPointsOption.click();
   // }
    //public void clickSearchButton() {
       // searchbar.click();
     //   searchbar.sendKeys("Laptop");
   // }
  //  public void checkbox()
  //  {
    	//Brands.click();
    //}
   // public void sorting()
    //{
    	//sortby.click();
    	//Pricelow.click();
   // }

//}

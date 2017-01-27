package openmarketwatch;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
 
//public class must be declared

public  class marketwatch {
// public static void is used 
@Test
public static void TestMarketWatch() throws InterruptedException {
WebDriver driver;
// create new firefox webdriver isntance by setting the properties using the code below 
System.setProperty("webdriver.firefox.bin","/Users/jasonsouryamath/Desktop");
driver = new FirefoxDriver();
driver.get("http://www.marketwatch.com/");

WebElement stock = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".btn--search")));
stock.click(); 
WebElement trump = driver.findElement(By.cssSelector(".search__input"));
trump.sendKeys("stock");
Thread.sleep(2000);
driver.findElement(By.cssSelector("#search-columns > div:nth-child(3) > a:nth-child(1)")).click();
driver.quit();
}

}

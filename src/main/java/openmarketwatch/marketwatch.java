package openmarketwatch;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
 
//public class must be declared

public  class marketwatch {
// public static void is used 
//@Test
WebDriver driver;
@Test
public void TestMarketWatch() throws InterruptedException {
//WebDriver driver;
// create new firefox webdriver isntance by setting the properties using the code below 
//System.setProperty("webdriver.firefox.bin","/Users/jasonsouryamath/Desktop/FirefoxDeveloperEdition.app/Contents/MacOS/firefox-bin");
//driver = new FirefoxDriver();
 //System.setProperty("webdriver.gecko.driver", "C:\\Users\\jsouryamath\\Desktop\\geckodriver.exe");
// driver =new FirefoxDriver();
System.setProperty("webdriver.chrome.driver", "/Users/Shared/Jenkins/Home/workspace/marketwatch/ChromeDriver");
driver =new ChromeDriver();
driver.get("http://www.marketwatch.com/");

WebElement stock = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".btn--search")));
stock.click(); 
WebElement trump = driver.findElement(By.cssSelector(".search__input"));
trump.sendKeys("stock");
Thread.sleep(2000);
driver.findElement(By.cssSelector("#search-columns > div:nth-child(3) > a:nth-child(1)")).click();
driver.close();
}

}

package flightbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginbasetest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		
		
		//launch browser
		
				System.setProperty("webdriver.chrome.driver", "C:\\chromdriver\\chromdriver 116\\chromedriver-win64\\chromedriver.exe");
		        ChromeOptions chromeOptions = new ChromeOptions();
		        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
		        chromeOptions.addArguments("--remote-allow-origins=*");
		        driver = new ChromeDriver(chromeOptions);
		        driver.manage().window().maximize();

        
   
   //create a object of elementtest
   
        elementtest loginpg= new elementtest(driver);
   
   //open url
        driver.get("http://localhost:8080/FlyAway/home");
   
   loginpg.Singin();
   loginpg.Addemail();
   loginpg.Addpass();
  loginpg.loginbutton();
  loginpg.Homebutton();
  loginpg.Selectsource();
  loginpg.Selectdestination();
  loginpg.clickonsubmit();
  loginpg.clickbookflight();
  loginpg.clickbookin();
  loginpg.clickSeebookin();
  
  
   

  
  System.out.println("test sussesfull");
  System.out.println("Page title is : " + driver.getTitle());
  
  
  Thread.sleep(7000);
  driver.quit();

	}

}

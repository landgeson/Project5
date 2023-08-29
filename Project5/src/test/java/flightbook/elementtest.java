package flightbook;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class elementtest {
	WebDriver driver;
    

	//constructor
	public elementtest (WebDriver d)
	{
		driver = d;	
	}
	  By login=By.xpath("//a[normalize-space()='Login/Signup']");
	  By enteremail=By.xpath("//input[@name='email_id']");
	  By enterpass=By.xpath("//input[@name='pwd']");
	  By loginbtn=By.xpath("//button[normalize-space()='Login']");
	  By Homebtn=By.xpath("//a[normalize-space()='Home']");
	  By submitbtn=By.xpath("//button[normalize-space()='Submit']");
	  By Bookflight=By.xpath("//a[normalize-space()='Book Flight']");
	  By Bookinbtn=By.xpath("//a[normalize-space()='Click to complete booking']");
	  By Seebookinbtn=By.xpath("//a[normalize-space()='See Your Bookings']");
	 
	 
	  
	  public void Singin() {
		  driver.findElement(login).click();
			
		}
	  public void Addemail() throws InterruptedException {
		  driver.findElement(enteremail).sendKeys("admin@admin.com");
		  Thread.sleep(2000);
			}
	  public void Addpass() throws InterruptedException {
	
		  driver.findElement(enterpass).sendKeys("admin");
			
		}
	  public void loginbutton() throws InterruptedException {
			
		  driver.findElement(loginbtn).click();
		  System.out.println("click on login");
		  Thread.sleep(2000);
		}
	  
	  public void Homebutton() throws InterruptedException {
		  driver.findElement(Homebtn).click();
		  Thread.sleep(2000);
		}
	  
	  public void Selectsource() throws InterruptedException {
		  WebElement dropSourceEle=driver.findElement(By.xpath("//select[@name='source']"));
			
			Select dropcountry=new Select(dropSourceEle);
			
			List<WebElement>alloption=dropcountry.getOptions();
			
			for(WebElement option:alloption){
				
				if(option.getText().equals("Bangalore"))
				{
					option.click();
					break;
				}
				}
			}
	  
	  public void Selectdestination() throws InterruptedException {
		  WebElement dropDestinationEle=driver.findElement(By.xpath("//select[@name='destination']"));
			
			Select dropdestination=new Select(dropDestinationEle);
			
			List<WebElement>alloption=dropdestination.getOptions();
			
			for(WebElement option:alloption){
				
				if(option.getText().equals("Hyderabad"))
				{
					option.click();
					break;
				}
				}
			}
	  
	  public void clickonsubmit() throws InterruptedException {
		  driver.findElement(submitbtn).click();
		  Thread.sleep(2000);
		}
	  public void clickbookflight() throws InterruptedException {
		  driver.findElement(Bookflight).click();
		  Thread.sleep(2000);
		}
	  
	  public void clickbookin() throws InterruptedException {
		  driver.findElement(Bookinbtn).click();
		  Thread.sleep(2000);
		}
	  
	  public void clickSeebookin() throws InterruptedException {
		  driver.findElement(Seebookinbtn).click();
		  Thread.sleep(2000);
		}

	
	  }


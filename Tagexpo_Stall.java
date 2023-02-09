package reusable_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tagexpo_Stall 
{
	public static WebDriver driver;
	
 @Test
  public void f() throws InterruptedException 
  {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://tagexpo.in/exhibitor");
	  
	  driver.findElement(By.xpath("//button[contains(text(),'Click to Exhibit')]")).click();
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//button[contains(text(),'Booking')]")).click();
	  
	  List <WebElement> Values = driver.findElements(By.id("tooltip"));
	  System.out.println(Values.size());
	  for (int i = 0; i < Values.size(); i++) 
	  {
		  System.out.println(Values.get(i).getAttribute("title"));		
	}
	  
  }
}

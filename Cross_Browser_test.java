package mhrcm_Ui_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross_Browser_test 
{
   public static WebDriver driver;
   
  @Test
  public void f() 
  {
	  driver.get("https://www.tba.ai/blogs/guide-to-understanding-and-reducing-bounce-rate-for-your-website");
  }
  @BeforeMethod
  @Parameters({"browser"})
  public void beforeMethod(String browser) 
  {
	  if(browser.equalsIgnoreCase("Chrome"))
	  {
		//  System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
	  }
	  else if(browser.equalsIgnoreCase("Firefox"))
	  {
		  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sachithanandhan.S\\Downloads\\geckodriver-v0.32.0-win64_109\\geckodriver.exe");
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
      }
	  else if(browser.equalsIgnoreCase("Edge"))
	  {
		 // System.setProperty("webdriver.edge.driver", "C:\\Soft\\msedgedriver.exe");
		  
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
      }
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }

}

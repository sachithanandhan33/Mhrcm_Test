package mhrcm_Ui_test;


	import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;
	
public class Screenshot_test 
	
	{
	 
	public static void main(String[] args) throws Exception 
	  
	{
	    // set the driver path for Chrome
	    //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
 
		WebDriverManager.chromedriver().setup();
		
	    // create a new instance of Chrome driver
	    WebDriver driver = new ChromeDriver();
  
	    // maximize the window
	    driver.manage().window().maximize();

	    // navigate to the website
	    driver.get("https://www.1clx.com");

	    // cast the driver to a JavascriptExecutor to run JavaScript
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    // get the total height of the page
	    Long pageHeight = (Long) js.executeScript("return document.body.scrollHeight");
	    
	    // set the window size to the full height of the page
	    driver.manage().window().setSize(new Dimension(1280, pageHeight.intValue()));
	    
	    // take screenshot
	    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    
	    // save screenshot
	    FileUtils.copyFile(screenshot, new File("fullpage-screenshot.png"));
	    
	    
	    // close the driver
	   // driver.quit();
	  }
	}




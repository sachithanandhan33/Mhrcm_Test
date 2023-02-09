package mhrcm_Ui_test;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.emulation.Emulation;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Mhrcm_responsive_test 
{
	public static WebDriver driver;
	
	 @DataProvider
	  public Object[][] mobileEmulation()
	  {
		return new Object[][]
				
				{
			
			
			{240,320,100,"JioPhone"},
			{600,1024,50,"Blackberry Playbook"},
			{800,1280, 40,"Kindle Fire HDX"},
			{384,640,75,"LG Optimus L70"},
			{640,360, 100,"Microsoft Lumia 550"},
			{ 800,1280,40,"Nexus 10"},
			{384,640,75,"Nexus 4"}, 
			{412,732,50,"(412x732)"},
			{600,960,50,"Nexus 7"},
			{320,533,97,"Nokia Lumia 520"},
			{480,854,50,"Nokia N9"},
			{393,786,66,"(393x786)"},
			{353,745,70,"Pixel 4"},
			{393,851,61,"Pixel 5"},
			{912,1368,38,"Surface Pro 7"},
			{540,720,70,"Surface Duo"},
			{1024,600,50,"Nest Hub"},
			{1280,800,50,"Nest Hub Max"},
			{411,731,71,"Pixel 2"}, 
			{411,823,63,"Pixel 2XL"}

							
						 
	};  
	}
		
	
	
  @SuppressWarnings("deprecation")
  @Test(dataProvider="mobileEmulation")
  public void mhrcm_Ui_test(int a,int b,int c,String name) throws InterruptedException, IOException 
  {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		DevTools devtool=driver.getDevTools();
		devtool.createSession();
		devtool.send(Emulation.setDeviceMetricsOverride(a,b,c,true,
				Optional.empty(), 
				Optional.empty(),
				Optional.empty(),
				Optional.empty(),
				Optional.empty(),
				Optional.empty(),
				Optional.empty(),
				Optional.empty(),
				Optional.empty()));
		
		driver.get("https://www.tba.ai/blogs/an-effective-seo-checklist-to-better-your-seo-results-in-2023");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		

		
		 if (j.executeScript("return document.readyState").toString().equals("complete"))
		 {
			 
	         System.out.println("Page has loaded");
	         j.executeScript("window.scrollBy(0,2000);");
	         Thread.sleep(3000);
	         j.executeScript("window.scrollBy(0,2000);");
	         Thread.sleep(3000);
	         j.executeScript("window.scrollBy(0,2000);");
	         Thread.sleep(3000);
	         j.executeScript("window.scrollBy(0,2000);");
	         Thread.sleep(3000);
	         j.executeScript("window.scrollBy(0,2000);");
	         Thread.sleep(3000);
	         j.executeScript("window.scrollBy(0,2000);");
	         Thread.sleep(3000);
	         j.executeScript("window.scrollBy(0,2000);");
	         Thread.sleep(3000);
	         j.executeScript("window.scrollBy(0,2000);");
	         Thread.sleep(3000);
	         j.executeScript("window.scrollBy(0,-3000);");
	         Thread.sleep(3000);
	         j.executeScript("window.scrollBy(0,-3000);");
	         Thread.sleep(3000);
	         j.executeScript("window.scrollBy(0,-3000);");
	         Thread.sleep(5000);
	         j.executeScript("window.scrollBy(0,-3000);");
	         Thread.sleep(5000);
	         j.executeScript("window.scrollBy(0,-3000);");
	         Thread.sleep(5000);
	         
	         Thread.sleep(5000);
	         
	        File src=((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
	     	FileHandler.copy(src, new File("C:\\Users\\Sachithanandhan.S\\eclipse-workspace3\\mhrcm\\Tba_Blog\\" + name + ".png"));
		 }
	     else
	     {
	 	   	 System.out.println("Page has not loaded yet ");
	 	 }
		 
         		 
		 
	}
  
 	  
  }


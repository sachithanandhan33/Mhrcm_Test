package mhrcm_Ui_test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class mhrcm_Brokenlink_test  
{
	public static WebDriver driver;
	

  @SuppressWarnings("unused")
public static  void main(String[] args) throws InterruptedException, IOException 
  {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.tba.ai/blogs/guide-to-understanding-and-reducing-bounce-rate-for-your-website");

	  Thread.sleep(5000);
	  
	  List <WebElement> links = driver.findElements(By.tagName("a"));
	  System.out.println(" Number of Links are " +  links.size());
	  List<String>urllist=new ArrayList<String>();
	  
	  for(WebElement link:links)
	  {
        String url=link.getAttribute("href");
        //urllist.add(url);
      Checkbrokenlink(url);

	  }
	  
	 // driver.quit();
	  
  }
		
	  public static void Checkbrokenlink(String linkurl)
	  {
		  
		try
		{
			URL url=new URL(linkurl);
			HttpURLConnection httpurlconnect=(HttpURLConnection) url.openConnection();
			httpurlconnect.setConnectTimeout(5000);
			httpurlconnect.connect();
			
			if(httpurlconnect.getResponseCode()>=400) 
			{
				System.out.println(linkurl + " " + httpurlconnect.getResponseMessage()+ " " + httpurlconnect.getResponseCode()  + " is a broken link ");
			}
			else
			{
				System.out.println(linkurl + " " + httpurlconnect.getResponseMessage() + " " + httpurlconnect.getResponseCode() + " is a valid link ");
		
			}
			
			
		}
		catch(Exception e)
		{
			
		}
		  
	  }
		  
		  
		
	  
	  
	  
	  
}
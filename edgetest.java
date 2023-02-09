package testngframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class edgetest 
{
	public static WebDriver driver;
	
    @SuppressWarnings("deprecation")
  
@Test
  public void Open_Edge()
  {
	  
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.tba.ai/blogs/guide-to-understanding-and-reducing-bounce-rate-for-your-website");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }
  
}

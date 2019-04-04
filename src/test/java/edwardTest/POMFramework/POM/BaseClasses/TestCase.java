package edwardTest.POMFramework.POM.BaseClasses;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class TestCase
{

  protected WebDriver driver;

  public TestCase()
  {
    try 
    {
      driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new ChromeOptions());
    }
    catch (MalformedURLException exception)
    {
      exception.printStackTrace();
    }
  }

  @After
  public void Cleanup()
  {
    driver.quit();
  }

  
}
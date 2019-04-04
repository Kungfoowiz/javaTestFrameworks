package edwardTest.NonPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleImagesTest 
{

    
    public void doGoogleImagesSearchTest()
    {

        var driver = new ChromeDriver();
        driver.get("https://www.google.com");


        var element = driver.findElement(By.className("gLFyf"));
        element.sendKeys("chocolate chewing gum");
        element.submit();

        
        driver.findElement(By.linkText("Images")).click();
        
        element = driver.findElements(By.cssSelector("a[class = 'rg_l']")).get(4);
        element.findElement(By.tagName("img")).click();

    }
}

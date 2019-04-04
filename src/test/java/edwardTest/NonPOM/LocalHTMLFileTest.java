package edwardTest.NonPOM;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class LocalHTMLFileTest {
  public static void main(String[] args) throws Exception {

    // Basic
    // var driver = new ChromeDriver();
    // var driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
    // DesiredCapabilities.chrome());

    // Selenium grid
    var options = new ChromeOptions();
    // options.addArguments(Arrays.asList("--headless", "--whitelisted-ips",
    // "--no-sandbox", "--disable-extensions"));
    // options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,UnexpectedAlertBehaviour.IGNORE);
    var driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
    driver.get("file:///Users/edward/MyWork/javaTestFrameworks/src/main/webapp/index.html");

    // Implicit wait
    // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    // Explicit wait
    // WebDriverWait wait = new WebDriverWait(driver, 10);
    // wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lettuce")));

    // Get colour radio buttons, click green, get value of clicked button.
    var elements = driver.findElements(By.name("color"));
    elements.get(1).click();

    for (var element : elements) {
      if (element.isSelected()) {
        System.out.println(element.getAttribute("value"));
      }
    }

    // Double click tomato checkbox, click lettuce checkbox.

    driver.findElement(By.id("tomato")).click();
    driver.findElement(By.id("tomato")).click();

    driver.findElement(By.id("lettuce")).click();

    // Select ice-cream option.
    var element = driver.findElement(By.id("select1"));
    new Select(element).selectByVisibleText("Ice-cream");

    // Get text value of first td in second table.

    element = driver.findElement(By.tagName("table"));
    var elementInner = element.findElement(By.tagName("table"));
    var row = elementInner.findElements(By.tagName("td")).get(0);
    System.out.println(row.getText());

    // Xpath version of above test.
    System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[1]/td")).getText());

    // Browser/test clean up.
    driver.quit();

  }

}

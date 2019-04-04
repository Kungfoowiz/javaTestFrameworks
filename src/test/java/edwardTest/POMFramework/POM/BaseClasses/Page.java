package edwardTest.POMFramework.POM.BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {

  @FindBy(tagName="title")
  WebElement title;

  private WebDriver driver;

  public Page(WebDriver driver)
  {
    this.driver = driver;
  }

  public void gotoUrl(String url)
  {
    driver.get(url);

    PageFactory.initElements(driver, this);
  }

  public String getTitle()
  {
    return title.getAttribute("textContent");

    // return driver.findElement(By.tagName("title")).getAttribute("textContent");
  }

}
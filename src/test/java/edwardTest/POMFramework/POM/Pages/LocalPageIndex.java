package edwardTest.POMFramework.POM.Pages;

import edwardTest.POMFramework.POM.BaseClasses.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LocalPageIndex extends Page
{

  @FindBy( how = How.ID, using = "select1" )
  private WebElement element;

  @FindBy( how = How.CSS, using = "#select1 option:nth-child(3)" )
  private WebElement option;


  public LocalPageIndex(WebDriver driver)
  {
    super(driver);
  }

  public void selectOption(String option)
  {
    new Select(element).selectByVisibleText(option);
  }

  public Boolean getOptionSelected(){
    return option.isSelected();
  }

}

package edwardTest.POMFramework.TestCases;

import edwardTest.POMFramework.POM.BaseClasses.TestCase;
import edwardTest.POMFramework.POM.Pages.LocalPageIndex;
import org.junit.Assert;
import org.junit.Test;

public class TestLocalPageIndex extends TestCase {
  
  @Test
  public void LocalPageIndexTitle()
  {
    var page = new LocalPageIndex(driver);
    
    page.gotoUrl("file:///Users/edward/MyWork/javaTestFrameworks/src/main/webapp/index.html");
    
    page.selectOption("Coffee");


    Assert.assertTrue(page.getTitle().equals("Wonderland"));
    Assert.assertTrue(page.getOptionSelected());
  }

}

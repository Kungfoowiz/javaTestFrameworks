package edwardTest.Cucumber.Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class Definitions1 {

  private int number;
  private int guess;

  @Given("^number is equal to (\\d+)$")
  public void pi_equal_to(int value)
  {
    number = value;
  }

  @When("^I guess it is (\\d+)$")
  public void when_guess_is(int value)
  {
    guess = value;
  }

  @Then("^my guess is wrong$")
  public void guess_is_wrong()
  {
    assertTrue(number != guess);
  }

  @Then("^my guess is right$")
  public void guess_is_right()
  {
    assertTrue(number == guess);
  }



}
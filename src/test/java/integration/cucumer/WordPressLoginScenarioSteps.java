package integration.cucumer;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import integration.serenitySteps.WordPressLoginSteps;
import net.thucydides.core.annotations.Steps;

public class WordPressLoginScenarioSteps {

    @Steps
    WordPressLoginSteps loginSteps;

    @Given("User is on login page")
    public void gotoLoginPage() {
        loginSteps.loginPageInvalidDataInput();
    }

    @When("Enter invalid credentials")
    public void enterInvalidData() {
        loginSteps.enterLoginData();
    }

    @Then("User is shown error message")
    public void checkErrorMessage() {
        loginSteps.checkErrorMessage();
    }


}

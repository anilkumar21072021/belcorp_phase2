package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs {
    @Given("open browser and hit the url")
    public void openBrowserAndHitTheUrl() {
        System.out.println("Given ! ");
    }
    @Then("close the browser")
    public void closeTheBrowser() {
        System.out.println("Then !");
    }
}

package stepdefinitions;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import userinterfaces.HomePage;

public class RegisterSteps {


    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Sebastia");
    private HomePage homePage = new HomePage();


    @Given("^thah a new users accesses the register in website$")
    public void thahANewUsersAccessesTheRegisterInWebsite() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
        navegador.manage().window().maximize();

    }


    @When("^he goes to the register page, fill in the fields$")
    public void heGoesToTheRegisterPageFillInTheFields() {

    }

    @Then("^he sees the page login\\.$")
    public void heSeesThePageLogin() {

    }
}

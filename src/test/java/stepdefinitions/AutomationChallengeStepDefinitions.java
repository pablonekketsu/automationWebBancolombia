package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AutomationChallengeData;
import net.serenitybdd.screenplay.actors.OnStage;
import task.Fill;
import task.OpenUp;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class AutomationChallengeStepDefinitions {
    @Given("^that (.*) wants create a new profile on Utest$")
    public void thatPabloWantsCreateANewProfileOnUtest(String actor) {
        theActorCalled(actor).wasAbleTo(OpenUp.thePage());
    }

    @When("^he complying all the require steps$")
    public void heComplyingAllTheRequireSteps(List<AutomationChallengeData> automationChallengeData) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Fill.the(automationChallengeData.get(0).getName(),
                automationChallengeData.get(0).getLastName(),
                automationChallengeData.get(0).getEmail(),
                automationChallengeData.get(0).getDay(),
                automationChallengeData.get(0).getMonth(),
                automationChallengeData.get(0).getYear(),
                automationChallengeData.get(0).getCity(),
                automationChallengeData.get(0).getZip_code(),
                automationChallengeData.get(0).getUser(),
                automationChallengeData.get(0).getPassword()));
    }

    @Then("^the profile is create successful$")
    public void theProfileIsCreateSuccessful() {

    }

}

package co.com.choucair.proyectobase.stepdefinitions;

import co.com.choucair.proyectobase.model.AcademyChoucairData;
import co.com.choucair.proyectobase.questions.Answer;
import co.com.choucair.proyectobase.tasks.Abrir;
import co.com.choucair.proyectobase.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Juanes wants to learn automatizacion Bancolombia on the choucair academy platform$")
    public void thanJuanWantsToLearnAutomatizacionBancolombiaOnTheChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception  {
        OnStage.theActorCalled("Juanes").wasAbleTo(Abrir.pagina(), Login.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));

    }

    @When("^he search for the course on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course$")
    public void heFindsTheCourseCalledResourcesWorkshopDeAutomatizacion(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }
}

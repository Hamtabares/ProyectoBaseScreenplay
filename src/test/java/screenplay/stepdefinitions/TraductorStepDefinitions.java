package screenplay.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;
import questions.LaRespuesta;
import tasks.Abrir;
import tasks.Traducir;

public class TraductorStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor elkin = Actor.named("elkin");

    @Before
    public void configuracionInicial() {
        elkin.can(BrowseTheWeb.with(navegador));
    }

    @Given("^que elkin quiere usar el traductor de google$")
    public void queElkinQuiereUsarElTraductorDeGoogle() {
        elkin.wasAbleTo(Abrir.LaPaginaDeGoogle());

    }


    @When("^el traduce la palabra (.*) de ingles a espanol$")
    public void elTraduceLaPalabraHouseDeInglesAEspanol(String palabra) {
        elkin.attemptsTo(Traducir.DeInglesAEspanolLa(palabra));
    }


    @Then("^el deberia visualizar la palabra (.*) en la pantalla$")
    public void elDeberiaVisualizarLaPalabraCasaEnLaPantalla(String palabraEsperada) {
        elkin.should(seeThat(LaRespuesta.es(), equalTo(palabraEsperada)));

    }
}

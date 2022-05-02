package co.carloslogol.test_app.stepdefinitions;

import co.carloslogol.test_app.model.Usuario;
import co.carloslogol.test_app.tasks.Login;
import co.carloslogol.test_app.tasks.OpenThe;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepDefinitions {

    @Before
    public void prepareStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^que el usuario abre la aplicacion$")
    public void queElUsuarioAbreLaAplicacion() {
        theActorCalled("carloslogol").attemptsTo(OpenThe.logginApp());
    }


    @When("^el usuario digita su usuario y contrasena$")
    public void elUsuarioDigitaSuUsuarioYContrasena(List<Usuario> usuario) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.with(usuario));
    }

    @Then("^deberia dejarlo ingresar$")
    public void deberiaDejarloIngresar() {
        /** TO DO */
    }

}
